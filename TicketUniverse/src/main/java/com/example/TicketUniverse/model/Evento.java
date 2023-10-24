package com.example.TicketUniverse.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate data;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_localita")
    private Localita localita;
    private String descrizione;
    private Double prezzo;
    private Integer bigliettiDisponibili;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

}
