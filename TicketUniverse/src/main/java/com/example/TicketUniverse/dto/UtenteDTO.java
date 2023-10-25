package com.example.TicketUniverse.dto;

import lombok.Data;

import java.util.List;
@Data
public class UtenteDTO {

    private String nome;
    private String cognome;
    private String password;
    private String email;
    private String codiceFiscale;
    private List<PrenotazioneDTO> prenotazioni;


}
