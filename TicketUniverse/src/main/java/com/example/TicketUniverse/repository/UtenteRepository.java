package com.example.TicketUniverse.repository;

import com.example.TicketUniverse.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteRepository extends JpaRepository<Long, Utente> {


}
