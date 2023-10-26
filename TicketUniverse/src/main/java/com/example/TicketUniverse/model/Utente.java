package com.example.TicketUniverse.model;

import com.example.TicketUniverse.enumerati.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cognome;
    private String password;
    private String email;
    @Column(name = "codice_fiscale")
    private String codiceFiscale;
    @OneToMany(mappedBy = "utente", cascade = CascadeType.ALL)
    private List<Prenotazione> prenotazioni;
    private Status status;

    public Utente(Long id, String nome, String cognome, String password, String email, String codiceFiscale, List<Prenotazione> prenotazioni) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.email = email;
        this.codiceFiscale = codiceFiscale;
        this.prenotazioni = prenotazioni;
    }

    public Utente() {
    }


}