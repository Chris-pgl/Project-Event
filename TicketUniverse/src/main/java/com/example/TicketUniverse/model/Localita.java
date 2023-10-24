package com.example.TicketUniverse.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "localita")
public class Localita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String regione;
    private String provincia;
    private String citta;
    private String indirizzo;
    @OneToMany(mappedBy = "localita")
    private List<Evento> eventi;
}
