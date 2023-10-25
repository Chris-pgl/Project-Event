package com.example.TicketUniverse.dto;


import java.time.LocalDateTime;


public class EventoDTO {

    private String nome;
    private String descrizione;
    private Double prezzo;
    private Integer bigliettiDisponibili;
    private Long idCategoria;
    private Long idLocalita;
    private LocalDateTime data;

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

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getBigliettiDisponibili() {
        return bigliettiDisponibili;
    }

    public void setBigliettiDisponibili(Integer bigliettiDisponibili) {
        this.bigliettiDisponibili = bigliettiDisponibili;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Long getIdLocalita() {
        return idLocalita;
    }

    public void setIdLocalita(Long idLocalita) {
        this.idLocalita = idLocalita;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
