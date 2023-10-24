package com.example.TicketUniverse.dto;

import com.example.TicketUniverse.model.Utente;

import java.time.LocalDateTime;

public class PrenotazioneDTO {

    private LocalDateTime data;

    private Utente utente;

    private Integer quantitaPrenotata;

    private Boolean isCoonvalidata;

    private Double prezzoTotale;

    public PrenotazioneDTO() {
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

    public Boolean getCoonvalidata() {
        return isCoonvalidata;
    }

    public void setCoonvalidata(Boolean coonvalidata) {
        isCoonvalidata = coonvalidata;
    }

    public Double getPrezzoTotale() {
        return prezzoTotale;
    }

    public void setPrezzoTotale(Double prezzoTotale) {
        this.prezzoTotale = prezzoTotale;
    }
}
