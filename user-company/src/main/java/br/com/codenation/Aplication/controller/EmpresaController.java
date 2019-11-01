package br.com.codenation.Aplication.controller;

import br.com.codenation.Aplication.service.impl.EmpresaService;

import java.io.IOException;

public class EmpresaController{
    public void create() throws IOException {
        EmpresaService empresaService = new EmpresaService();
        empresaService.create(1, "Codenation", "001", 3, "www.codenation.com");
        empresaService.create(2, "Inter", "002", 36, "www.inter.com.br");
        empresaService.create(3, "InterMedium", "003", 36, "www.intermedium.com");

    }
}
