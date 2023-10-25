package com.example.TicketUniverse.dto;

import lombok.Data;

import java.util.List;
@Data
public class LocalitaDTO {

    private String regione;
    private String provincia;
    private String citta;
    private List<EventoDTO> eventi;




}
