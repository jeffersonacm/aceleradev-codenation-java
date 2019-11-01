package br.com.codenation.Aplication.service.impl;

import br.com.codenation.Aplication.annotation.Method;
import br.com.codenation.Aplication.entity.Empresa;
import br.com.codenation.Aplication.entity.Usuario;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class FileStreamService extends BaseService {

    String path = new File("").getAbsolutePath() + "/src/main/java/br/com/codenation/Aplication/resources";
    private final String usuarioFIle = path+"/usuarios.txt";
    private final String empresaFile = path+"/empresa.txt";

    public FileStreamService() {
        empresaList = new ArrayList<Empresa>();
        usuariosList = new ArrayList<Usuario>();
    }

    @Method(position = 1)
    public void getUsuarioList() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(usuarioFIle));
        UsuarioService usuarioService = new UsuarioService();
        String linha = "";
        String [] data;
        Integer count = 0;

        while (true) {
            linha = buffRead.readLine();

            if (linha != null) {
                if (count != 0) {
                    data = linha.split(";");
                    usuarioService.create(count, data[0], data[1], new Integer(data[2]), data[3], data[4], new Integer(data[5]), new BigDecimal(data[6]));
                }
            } else
                break;

            count++;
        }
    }

    public void getEmpresaList() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(empresaFile));
        EmpresaService empresaService = new EmpresaService();
        String linha = "";
        String [] data;
        Integer count = 0;

        while (true) {
            linha = buffRead.readLine();

            if (linha != null) {
                if(count != 0) {
                    data = linha.split(";");
                    empresaService.create(count, data[0], data[1], new Integer(data[2]), data[3]);
                }
            } else
                break;

            count++;
        }
        buffRead.close();
    }

    public void print() {
        empresaList.forEach(s -> System.out.println(s.getNome()));
        usuariosList.forEach(s -> System.out.println(s.getSenha()));
    }
}
