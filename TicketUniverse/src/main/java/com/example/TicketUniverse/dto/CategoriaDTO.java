package com.example.TicketUniverse.dto;

import com.example.TicketUniverse.model.Evento;

import java.util.List;

public class CategoriaDTO {


    private String nome;
    private List<EventoDTO> eventi;

    public CategoriaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<EventoDTO> getEventi() {
        return eventi;
    }

    public void setEventi(List<EventoDTO> eventi) {
        this.eventi = eventi;
    }
}
