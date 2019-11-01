package br.com.codenation.Aplication.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Empresa extends Pessoa {

    private int vagas;

    private List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    private String webSite;

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
