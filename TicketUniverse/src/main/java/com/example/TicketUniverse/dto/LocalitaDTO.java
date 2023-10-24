package com.example.TicketUniverse.dto;

import com.example.TicketUniverse.model.Evento;

import java.util.List;

public class LocalitaDTO {

    private String regione;
    private String provincia;
    private String citta;
    private List<Evento> eventi;

    public LocalitaDTO() {
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public List<Evento> getEventi() {
        return eventi;
    }

    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }
}
