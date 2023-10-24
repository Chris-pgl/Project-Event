package com.example.TicketUniverse.repository;

import com.example.TicketUniverse.model.Offerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffertaRepository extends JpaRepository<Offerta, Long> {
}
