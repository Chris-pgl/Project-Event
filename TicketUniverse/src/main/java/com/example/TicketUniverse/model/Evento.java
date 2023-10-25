package com.example.TicketUniverse.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data;
    private String nome;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_localita")
    private Localita localita;
    private String descrizione;
    private Double prezzo;
    private Integer bigliettiDisponibili;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    @JsonManagedReference
    @OneToMany(mappedBy = "evento")
    private List<Prenotazione> prenoazioni;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Localita getLocalita() {
        return localita;
    }

    public void setLocalita(Localita localita) {
        this.localita = localita;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Prenotazione> getPrenoazioni() {
        return prenoazioni;
    }

    public void setPrenoazioni(List<Prenotazione> prenoazioni) {
        this.prenoazioni = prenoazioni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(id, evento.id) && Objects.equals(data, evento.data) && Objects.equals(nome, evento.nome) && Objects.equals(localita, evento.localita) && Objects.equals(descrizione, evento.descrizione) && Objects.equals(prezzo, evento.prezzo) && Objects.equals(bigliettiDisponibili, evento.bigliettiDisponibili) && Objects.equals(categoria, evento.categoria) && Objects.equals(prenoazioni, evento.prenoazioni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, nome, localita, descrizione, prezzo, bigliettiDisponibili, categoria, prenoazioni);
    }
}
