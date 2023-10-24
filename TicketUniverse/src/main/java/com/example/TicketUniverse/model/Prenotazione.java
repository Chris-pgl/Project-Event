package com.example.TicketUniverse.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime data;
    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;
    private Integer quantitaPrenotata;
    private Boolean isConvalidata;
    private Double prezzoTotale;
    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;

    public Prenotazione(Long id, LocalDateTime data, Utente utente, Integer quantitaPrenotata, Boolean isConvalidata, Double prezzoTotale, Evento evento) {
        this.id = id;
        this.data = data;
        this.utente = utente;
        this.quantitaPrenotata = quantitaPrenotata;
        this.isConvalidata = isConvalidata;
        this.prezzoTotale = prezzoTotale;
        this.evento = evento;
    }

    public Prenotazione() {
    }
}
