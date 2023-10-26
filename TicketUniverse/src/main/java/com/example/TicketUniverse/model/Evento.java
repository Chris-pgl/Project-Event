package com.example.TicketUniverse.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Data
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

}
