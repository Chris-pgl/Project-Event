package com.example.TicketUniverse.dto;

import com.example.TicketUniverse.model.Evento;
import lombok.Data;

import java.util.List;
@Data
public class CategoriaDTO {

    private String nome;
    private List<EventoDTO> eventi;

}
