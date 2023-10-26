package com.example.TicketUniverse.model;

import com.example.TicketUniverse.enumerati.Status;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Entity
@Data
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
    private Status status;

}
