package br.com.codenation.Aplication.service;

import java.math.BigDecimal;

public interface UsuarioInterface {
    public void create(int id, String nome, String documento, int idade, String login, String senha, int idEmpresa, BigDecimal salario);

    public void find(int empresa, String nome, String documento);
}
