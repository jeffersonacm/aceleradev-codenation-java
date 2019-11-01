package br.com.codenation.Aplication.service.impl;

import br.com.codenation.Aplication.entity.Empresa;
import br.com.codenation.Aplication.entity.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BaseService {
    Logger log = LoggerFactory.getLogger(BaseService.class);

    protected static List<Empresa> empresaList;

    protected static List<Usuario> usuariosList;
}
