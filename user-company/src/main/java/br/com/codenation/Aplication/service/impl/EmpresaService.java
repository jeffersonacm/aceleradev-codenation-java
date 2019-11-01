package br.com.codenation.Aplication.service.impl;

import br.com.codenation.Aplication.entity.Empresa;
import br.com.codenation.Aplication.service.EmpresaInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmpresaService extends BaseService implements EmpresaInterface {
    public void create(int id, String nome, String documento, int vagas, String webSite) throws IOException {
        if(isValidArgument(nome, documento)) {
            Empresa empresa = new Empresa();
            empresa.setId(id);
            empresa.setNome(nome);
            empresa.setDocumento(documento);
            empresa.setVagas(vagas);

            this.empresaList.add(empresa);
        }
    }

    private boolean isValidArgument(String nome, String documento) {
        for (Empresa n : this.empresaList) {
            if (n.getNome().equals(nome)) {
                throw new IllegalArgumentException("Já existe empresa com o nome " + nome);
            } else if (n.getDocumento() == documento) {
                throw new IllegalArgumentException("Já existe empresa com o documento " + documento);
            }
        }

//        log.info("####  Inclusão de impresa: " + nome + " - " + documento);
        return true;
    }

    public Empresa find(int id) {
        return this.empresaList.stream().filter(n -> n.getId() == id).findFirst().orElse(null);
    }

    public List<Empresa> getEmpresaList() {
        return this.empresaList;
    }
}
