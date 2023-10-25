package com.example.TicketUniverse.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventoDTO {

    private String nome;
    private String descrizione;
    private Double prezzo;
    private Integer bigliettiDisponibili;
    private CategoriaDTO categoria;
    private LocalitaDTO localita;
    private LocalDateTime data;

}
