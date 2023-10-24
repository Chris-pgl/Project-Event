package com.example.TicketUniverse.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Offerta {
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
