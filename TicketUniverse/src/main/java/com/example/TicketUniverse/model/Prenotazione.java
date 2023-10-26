package com.example.TicketUniverse.model;

import com.example.TicketUniverse.enumerati.Status;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Data
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data;
    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;
    private Integer quantitaPrenotata;
    private Boolean isConvalidata;
    private Double prezzoTotale;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;
    private Status status;

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
