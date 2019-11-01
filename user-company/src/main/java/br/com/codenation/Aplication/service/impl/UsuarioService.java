package br.com.codenation.Aplication.service.impl;

import br.com.codenation.Aplication.entity.Empresa;
import br.com.codenation.Aplication.entity.Pessoa;
import br.com.codenation.Aplication.entity.Usuario;
import br.com.codenation.Aplication.service.UsuarioInterface;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class UsuarioService extends BaseService implements UsuarioInterface {

    public void create(int id, String nome, String documento, int idade, String login, String senha, int idEmpresa, BigDecimal salario) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNome(nome);
        usuario.setEmpresa(findEmpresaById(idEmpresa));
        usuario.setDocumento(documento);
        usuario.setIdade(idade);
        usuario.setLogin(login);
        usuario.setSenha(criptyPass(senha));
        usuario.setSalario(salario);

        isNotEmpty(usuario);
        isValidArgument(usuario);
//        log.info("### Inclusão de usuário:" + nome + " - " + documento);
        usuariosList.add(usuario);
        usuario.getEmpresa().getListaUsuarios().add(usuario);
    }

    private void isNotEmpty(Usuario uModel) {
        if(uModel.getNome().isEmpty()) {
            throw new NullPointerException("O campo nome não pode ser vazio");
        } else if(uModel.getLogin().isEmpty()) {
            throw new NullPointerException("O campo login não pode ser vazio");
        } else if(uModel.getSenha().isEmpty()) {
            throw new NullPointerException("O campo senha não pode ser vazio");
        } else if(uModel.getDocumento().isEmpty()) {
            throw new NullPointerException("O campo documento não pode ser vazio");
        }
    }

    private void isValidArgument(Usuario uModel) {
        if(usuariosList.stream().filter(u -> u.getNome().equals(uModel.getNome())).findFirst().isPresent()) {
            throw new IllegalArgumentException("#### Erro: Já existe um usuario com o nome: " + uModel.getNome());
        } else if (usuariosList.stream().filter(u -> u.getDocumento().equals(uModel.getDocumento())).findFirst().isPresent()) {
            throw new IllegalArgumentException("#### Erro: Já existe um usuario com o documento: " + uModel.getDocumento());
        } else if (usuariosList.stream().filter(u -> u.getLogin().equals(uModel.getLogin())).findFirst().isPresent()) {
            throw new IllegalArgumentException("#### Erro: Já existe um usuario com o login: " + uModel.getLogin());
        }
    }

    public void find(int empresa, String nome, String documento) {
        List<Usuario> users = new ArrayList<Usuario>();

       empresaList.stream().filter(item -> empresa == item.getId()).collect(Collectors.toList());
    }

    public Empresa findEmpresaById(int idEmpresa) {
        return empresaList.stream()
                .filter(e -> e.getId() == idEmpresa)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Não foi encotrada nenhuma empresa com esse código"));
    }

    public String criptyPass(String nome) {
        String newString = nome;
        String [] replaceTarget = {"u", "s", "e", "r"};
        String [] replaceReplace = {"#OP", "%0", "LD7", "çA="};

        for (int i = 0; i < replaceTarget.length; i++) {
            newString = newString.replace(replaceTarget[i], replaceReplace[i]);
        }

        return newString;
    }

    public void findMaiorSalarioEmpresa() {
        Usuario user;
        for (Empresa empresa: empresaList) {
            user = empresa.getListaUsuarios()
                    .stream()
                    .max(Comparator.comparing(Usuario::getSalario))
                    .orElse(null);
            System.out.println(empresa.getNome() + " - " + user.getSalario());
        }
    }

    public BigDecimal findMaiorSalario() {
        Usuario user = usuariosList.stream()
                .max(Comparator.comparing(Usuario::getSalario))
                .orElse(null);
        return user.getSalario();
    }

    public void findMediaSalarioEmpresa() {
        for (Empresa empresa : empresaList) {
            empresa.getListaUsuarios()
                    .stream()
                    .map(Usuario::getSalario)
                    .mapToDouble(BigDecimal::floatValue)
                    .average()
                    .ifPresent(avg -> System.out.println(empresa.getNome() + " - " + avg));
        }
    }

    public void findFolhaSalarialEmpresa() {
        for (Empresa empresa : empresaList) {
            Double emp = empresa.getListaUsuarios()
                    .stream()
                    .map(Usuario::getSalario)
                    .mapToDouble(BigDecimal::floatValue)
                    .sum();
            System.out.println(empresa.getNome() + " - " + emp);
        }
    }

    public String findEmpresaMenorCusto() {
        Usuario user = null;
        String empresaNome = "";
        BigDecimal salario = new BigDecimal(0);

        for (Empresa empresa : empresaList) {
            user = empresa.getListaUsuarios()
                    .stream()
                    .min(Comparator.comparing(Usuario::getSalario))
                    .orElse(null);

            if (salario.equals(new BigDecimal(0))) {
                salario = user.getSalario();
                empresaNome = empresa.getNome();
            } else {
                if (salario.equals(user.getSalario())) {
                    empresaNome = empresa.getNome();
                    salario = user.getSalario();
                }
            }
        }

        return empresaNome + " - " + salario;
    }

    public Double findMediaIdade() {
        return usuariosList.stream().map(Usuario::getIdade).mapToDouble(Integer::intValue).average().getAsDouble();
    }

    public void findUsuariosIdade() {
        for (Empresa empresa : empresaList) {
            System.out.println("\n" + empresa.getNome());
            empresa.getListaUsuarios()
                    .stream()
                    .sorted(Comparator.comparing(Usuario::getIdade))
                    .forEach(user -> System.out.println(user.getNome() + " - " + user.getIdade()));
        }
    }

    public void print() {
        empresaList.forEach(s -> System.out.println(s.getNome()));
        usuariosList.forEach(s -> System.out.println(s.getSenha()));
    }
}
