package com.example.TicketUniverse.dto;

import com.example.TicketUniverse.model.Categoria;
import com.example.TicketUniverse.model.Localita;

public class EventoDTO {


    private String nome;
    private String descrizione;
    private double prezzo;
    private int bigliettiDisponibili;
    private Categoria categoria;
    private Localita localita;


    public EventoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getBigliettiDisponibili() {
        return bigliettiDisponibili;
    }

    public void setBigliettiDisponibili(int bigliettiDisponibili) {
        this.bigliettiDisponibili = bigliettiDisponibili;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Localita getLocalita() {
        return localita;
    }

    public void setLocalita(Localita localita) {
        this.localita = localita;
    }
}
