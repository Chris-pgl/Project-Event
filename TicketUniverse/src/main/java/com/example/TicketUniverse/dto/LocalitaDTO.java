package com.example.TicketUniverse.dto;

import com.example.TicketUniverse.enumerati.Status;
import lombok.Data;

@Data

public class LocalitaDTO {
    private Long id;
    private String regione;
    private String provincia;
    private String citta;
    private String indirizzo;
    private Status status;
}
