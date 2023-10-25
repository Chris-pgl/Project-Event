package com.example.TicketUniverse.dto;

import com.example.TicketUniverse.model.Utente;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class PrenotazioneDTO {

    private LocalDateTime data;

    private UtenteDTO utente;

    private Integer quantitaPrenotata;

    private Boolean isConvalidata;

    private Double prezzoTotale;

    public PrenotazioneDTO() {
    }


}
