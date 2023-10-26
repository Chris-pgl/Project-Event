package com.example.TicketUniverse.dto;

import com.example.TicketUniverse.enumerati.Status;
import lombok.Data;

@Data

public class CategoriaDTO {
    private Long id;
    private String nome;
    private Status status;
}
