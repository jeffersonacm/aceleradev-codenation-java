package br.com.codenation.Aplication.entity;

import br.com.codenation.Aplication.annotation.Column;

import java.math.BigDecimal;

public class Usuario extends Pessoa {

    @Column(position = 1, text = "Meu login é ")
    private String login;

    @Column(position = 2, text = "Minha senha é ")
    private String senha;

    private Empresa empresa;

    private BigDecimal salario;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
