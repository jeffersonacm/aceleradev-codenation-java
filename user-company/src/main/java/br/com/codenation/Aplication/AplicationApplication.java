package br.com.codenation.Aplication;

import br.com.codenation.Aplication.controller.EmpresaController;
import br.com.codenation.Aplication.controller.FileStreamController;
import br.com.codenation.Aplication.controller.UsuarioController;
import br.com.codenation.Aplication.entity.Empresa;
import br.com.codenation.Aplication.service.impl.FileStreamService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class AplicationApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(AplicationApplication.class, args);

		/*
		EmpresaController ctrlEmpresa = new EmpresaController();
		ctrlEmpresa.create();

		System.out.println("\n");

		UsuarioController ctrlUsuario = new UsuarioController();
		ctrlUsuario.create();*/

		FileStreamController ctrlFile = new FileStreamController();
		ctrlFile.createEmpresa();
	}
}
