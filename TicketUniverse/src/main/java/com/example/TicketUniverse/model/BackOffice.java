package com.example.TicketUniverse.model;

import com.example.TicketUniverse.enumerati.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
public class BackOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cognome;
    private String password;
    private String email;
    private Status status;

    public BackOffice(Long id, String nome, String cognome, String password, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.email = email;
    }

    public BackOffice() {
    }

}
