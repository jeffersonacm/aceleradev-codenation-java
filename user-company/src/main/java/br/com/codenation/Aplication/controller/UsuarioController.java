package br.com.codenation.Aplication.controller;

import br.com.codenation.Aplication.service.impl.UsuarioService;

import java.math.BigDecimal;

public class UsuarioController {
    public void create() {
        UsuarioService usuarioService = new UsuarioService();
        usuarioService.create(1,"jefferson", "1234", 20, "J232", "123456", 1, new BigDecimal(10000));
        usuarioService.create(2,"lucas", "2345", 25, "l3434", "758758", 2, new BigDecimal(9000));
        usuarioService.create(3,"gabriel", "2344", 21, "T343", "758858", 3, new BigDecimal(9600));

        //usuarioService.find(1, "jefferson", "1234");
    }
}
