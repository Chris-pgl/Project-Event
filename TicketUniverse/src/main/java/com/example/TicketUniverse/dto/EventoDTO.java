package com.example.TicketUniverse.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventoDTO {

    private String nome;
    private String descrizione;
    private Double prezzo;
    private Integer bigliettiDisponibili;
    private Long idCategoria;
    private Long idLocalita;
    private LocalDateTime data;

}
