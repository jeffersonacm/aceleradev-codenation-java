package br.com.codenation.Aplication.service;

import java.io.IOException;

public interface EmpresaInterface {
    public void create(int id, String nome, String documento, int vagas, String webSite) throws IOException;
}
