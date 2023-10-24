package com.example.TicketUniverse.repository;

import com.example.TicketUniverse.model.BackOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackOfficeRepository extends JpaRepository<BackOffice, Long> {
}
