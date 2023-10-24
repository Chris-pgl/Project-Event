package com.example.TicketUniverse.repository;

import com.example.TicketUniverse.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Long, Categoria> {


}
