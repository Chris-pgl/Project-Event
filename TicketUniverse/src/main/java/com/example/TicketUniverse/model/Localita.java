package com.example.TicketUniverse.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "localita")
public class Localita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String regione;
    private String provincia;
    private String citta;
    private String indirizzo;
    @JsonManagedReference
    @OneToMany(mappedBy = "localita")
    private List<Evento> eventi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public List<Evento> getEventi() {
        return eventi;
    }

    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Localita localita = (Localita) o;
        return Objects.equals(id, localita.id) && Objects.equals(regione, localita.regione) && Objects.equals(provincia, localita.provincia) && Objects.equals(citta, localita.citta) && Objects.equals(indirizzo, localita.indirizzo) && Objects.equals(eventi, localita.eventi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regione, provincia, citta, indirizzo, eventi);
    }
}
