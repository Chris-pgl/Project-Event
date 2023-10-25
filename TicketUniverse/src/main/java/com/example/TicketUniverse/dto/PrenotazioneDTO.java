package com.example.TicketUniverse.dto;


import lombok.Data;

import java.time.LocalDateTime;
@Data
public class PrenotazioneDTO {

    private LocalDateTime data;

    private Long idUtente;

    private Integer quantitaPrenotata;

    private Boolean isConvalidata;

    private Double prezzoTotale;




}
