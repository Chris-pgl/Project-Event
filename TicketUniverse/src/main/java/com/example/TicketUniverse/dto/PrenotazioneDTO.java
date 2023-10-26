package com.example.TicketUniverse.dto;



import java.time.LocalDateTime;
import java.util.Objects;

public class PrenotazioneDTO {
    private Long id;
    private LocalDateTime data;

    private Long idUtente;
    private Long idEvento;

    private Integer quantitaPrenotata;

    private Boolean isConvalidata;

    private Double prezzoTotale;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Long getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(Long idUtente) {
        this.idUtente = idUtente;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrenotazioneDTO that = (PrenotazioneDTO) o;
        return Objects.equals(data, that.data) && Objects.equals(idUtente, that.idUtente) && Objects.equals(quantitaPrenotata, that.quantitaPrenotata) && Objects.equals(isConvalidata, that.isConvalidata) && Objects.equals(prezzoTotale, that.prezzoTotale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, idUtente, quantitaPrenotata, isConvalidata, prezzoTotale);
    }
}
