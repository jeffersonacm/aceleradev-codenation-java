package br.com.jefferson.partymanagement.repository;

import br.com.jefferson.partymanagement.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestsRepository extends JpaRepository<Guest, Long> {
}
