package com.example.TicketUniverse.dto;



import com.example.TicketUniverse.enumerati.Status;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;
@Data
public class PrenotazioneDTO {
    private Long id;
    private LocalDateTime data;

    private Long idUtente;
    private Long idEvento;

    private Integer quantitaPrenotata;

    private Boolean isConvalidata;

    private Double prezzoTotale;
    private Status status;
}
