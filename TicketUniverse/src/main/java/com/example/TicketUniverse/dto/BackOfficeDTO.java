package com.example.TicketUniverse.dto;


import com.example.TicketUniverse.enumerati.Status;
import lombok.Data;

@Data
public class BackOfficeDTO {
    private Long id;
    private String nome;
    private String cognome;
    private String password;
    private String email;
    private Status status;

}
