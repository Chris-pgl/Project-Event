package com.example.TicketUniverse.dto;


import java.util.List;
import java.util.Objects;

public class UtenteDTO {

    private String nome;
    private String cognome;
    private String password;
    private String email;
    private String codiceFiscale;
    private List<PrenotazioneDTO> prenotazioni;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public List<PrenotazioneDTO> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<PrenotazioneDTO> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtenteDTO utenteDTO = (UtenteDTO) o;
        return Objects.equals(nome, utenteDTO.nome) && Objects.equals(cognome, utenteDTO.cognome) && Objects.equals(password, utenteDTO.password) && Objects.equals(email, utenteDTO.email) && Objects.equals(codiceFiscale, utenteDTO.codiceFiscale) && Objects.equals(prenotazioni, utenteDTO.prenotazioni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, password, email, codiceFiscale, prenotazioni);
    }
}
