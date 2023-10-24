package com.example.TicketUniverse.repository;

import com.example.TicketUniverse.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Long, Prenotazione> {


}
