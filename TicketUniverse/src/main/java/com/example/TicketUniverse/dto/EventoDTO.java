package com.example.TicketUniverse.dto;

import lombok.Data;

@Data
public class EventoDTO {


    private String nome;
    private String descrizione;
    private Double prezzo;
    private Integer bigliettiDisponibili;
    private CategoriaDTO categoria;
    private LocalitaDTO localita;


}
