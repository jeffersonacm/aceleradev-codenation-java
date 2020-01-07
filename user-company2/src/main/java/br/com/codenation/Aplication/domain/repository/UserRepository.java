package br.com.codenation.Aplication.domain.repository;

import br.com.codenation.Aplication.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

    User findByUsername(String nome);
}
