package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.EventoDTO;
import com.example.TicketUniverse.mapper.EventoMapper;
import com.example.TicketUniverse.model.Evento;
import com.example.TicketUniverse.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {


    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private EventoMapper eventoMapper;


    public List<EventoDTO> getAllEvent(){
        List<Evento> eventi = eventoRepository.findAll();
        List<EventoDTO> eventiDto = eventoMapper.toDto(eventi);
        return eventiDto;
    }

    public Evento salvaEvento(Evento evento){
        return eventoRepository.save(evento);
    }


    public String creaEvento(EventoDTO eventoDTO){
        Evento evento = eventoMapper.toEntity(eventoDTO);
        eventoRepository.save(evento);
        return "evento salvato";
    }


    public Evento eventoPerId(Long id){
        return eventoRepository.findById(id).orElse(null);
    }

    public Evento aggiornaEvento(Evento eventoEsistente, EventoDTO eventoDTO){
        eventoEsistente = eventoMapper.toEntity(eventoDTO);
        return eventoEsistente;
    }


    public void eliminaEvento(Evento evento){
        eventoRepository.delete(evento);
    }

    public Evento eliminaPerID(Long id ){
        eventoRepository.deleteById(id);
        return null;
    }



}