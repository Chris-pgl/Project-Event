package com.example.TicketUniverse.repository;

import com.example.TicketUniverse.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Long,Evento> {
}
