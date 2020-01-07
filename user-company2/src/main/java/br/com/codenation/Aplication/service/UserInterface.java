package br.com.codenation.Aplication.service;

import br.com.codenation.Aplication.domain.entity.User;

public interface UserInterface {

    User findByUsername(String name);
}
