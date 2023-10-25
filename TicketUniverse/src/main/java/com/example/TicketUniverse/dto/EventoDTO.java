package com.example.TicketUniverse.dto;

import java.time.LocalDate;


public class EventoDTO {


    private String nome;
    private String descrizione;
    private Double prezzo;
    private Integer bigliettiDisponibili;
    private CategoriaDTO categoria;
    private LocalitaDTO localita;

    private LocalDate data;


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

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

    public LocalitaDTO getLocalita() {
        return localita;
    }

    public void setLocalita(LocalitaDTO localita) {
        this.localita = localita;
    }


    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void setBigliettiDisponibili(Integer bigliettiDisponibili) {
        this.bigliettiDisponibili = bigliettiDisponibili;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
