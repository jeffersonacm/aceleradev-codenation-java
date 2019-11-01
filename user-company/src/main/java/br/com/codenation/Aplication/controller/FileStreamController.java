package br.com.codenation.Aplication.controller;

import br.com.codenation.Aplication.service.impl.EmpresaService;
import br.com.codenation.Aplication.service.impl.FileStreamService;
import br.com.codenation.Aplication.service.impl.UsuarioService;

import java.io.IOException;
import java.sql.SQLOutput;

public class FileStreamController {
    public void createEmpresa() throws IOException {
        FileStreamService fileStreamService = new FileStreamService();
        fileStreamService.getEmpresaList();
        fileStreamService.getUsuarioList();

        EmpresaService empresaService = new EmpresaService();
        UsuarioService usuarioService = new UsuarioService();

        // Maior salário
        System.out.println("\nMaior salário geral.....: " + usuarioService.findMaiorSalario());

        // Maior salário por empresa
        System.out.println("\nMaior salario por empresa:");
        usuarioService.findMaiorSalarioEmpresa();

        // media salarial
        System.out.print("\nMedia salarial por empresa: ");
        usuarioService.findMediaSalarioEmpresa();

        // folha salarial
        System.out.println("\nFolha salarial empresa: ");
        usuarioService.findFolhaSalarialEmpresa();
//        usuarioService.print();

        System.out.println("\nEmpresa com menor custo: ");
        System.out.println(usuarioService.findEmpresaMenorCusto());

        System.out.println("\nMédia de idade geral: ");
        System.out.println(usuarioService.findMediaIdade());

        System.out.println("\nIdade usuarios: ");
        usuarioService.findUsuariosIdade();
    }

    public void createUsuario() {

    }
}
