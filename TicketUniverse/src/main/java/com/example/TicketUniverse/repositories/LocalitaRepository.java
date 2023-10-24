package com.example.TicketUniverse.repositories;

import com.example.TicketUniverse.model.Localita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalitaRepository extends JpaRepository<Localita, Long> {


}
