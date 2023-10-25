package com.example.TicketUniverse.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
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
    @JsonBackReference
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Integer getQuantitaPrenotata() {
        return quantitaPrenotata;
    }

    public void setQuantitaPrenotata(Integer quantitaPrenotata) {
        this.quantitaPrenotata = quantitaPrenotata;
    }

    public Boolean getConvalidata() {
        return isConvalidata;
    }

    public void setConvalidata(Boolean convalidata) {
        isConvalidata = convalidata;
    }

    public Double getPrezzoTotale() {
        return prezzoTotale;
    }

    public void setPrezzoTotale(Double prezzoTotale) {
        this.prezzoTotale = prezzoTotale;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prenotazione that = (Prenotazione) o;
        return Objects.equals(id, that.id) && Objects.equals(data, that.data) && Objects.equals(utente, that.utente) && Objects.equals(quantitaPrenotata, that.quantitaPrenotata) && Objects.equals(isConvalidata, that.isConvalidata) && Objects.equals(prezzoTotale, that.prezzoTotale) && Objects.equals(evento, that.evento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, utente, quantitaPrenotata, isConvalidata, prezzoTotale, evento);
    }
}
