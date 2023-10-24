package com.example.TicketUniverse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Offerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<Evento> eventiOfferta;
    private Double prezzoMedio;

    public Offerta(Long id, List<Evento> eventiOfferta, Double prezzoMedio) {
        this.id = id;
        this.eventiOfferta = eventiOfferta;
        this.prezzoMedio = prezzoMedio;
    }

    public Offerta() {
    }
}
