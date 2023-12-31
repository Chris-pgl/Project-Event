package com.example.TicketUniverse.dto;


import com.example.TicketUniverse.enumerati.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data

public class EventoDTO {
    private Long id;
    private String nome;
    private String descrizione;
    private Double prezzo;
    private Integer bigliettiDisponibili;
    private Long idCategoria;
    private Long idLocalita;
    private LocalDateTime data;
    private Status status;
}
