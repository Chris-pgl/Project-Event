package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.EventoDTO;
import com.example.TicketUniverse.mapper.EventoMapper;
import com.example.TicketUniverse.model.Categoria;
import com.example.TicketUniverse.model.Evento;
import com.example.TicketUniverse.repositories.CategoriaRepository;
import com.example.TicketUniverse.repositories.EventoRepository;
import com.example.TicketUniverse.repositories.LocalitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {


    @Autowired
    private EventoRepository eventoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LocalitaRepository localitaRepository;
    @Autowired
    private EventoMapper eventoMapper;


    public List<EventoDTO> getAllEvent() {
        List<Evento> eventi = eventoRepository.findAll();
        List<EventoDTO> eventiDto = eventoMapper.toDto(eventi);
        return eventiDto;
    }

//    public EventoDTO salvaEvento(EventoDTO evento){
//        eventoRepository.save(eventoMapper.toEntity( evento));
//        return evento;
//    }


    public String creaEvento(EventoDTO eventoDTO) {
        Evento evento = eventoMapper.toEntity(eventoDTO);
        eventoRepository.save(evento);
        return "evento salvato";
    }


    public EventoDTO eventoPerId(Long id) {
        return eventoMapper.toDto(eventoRepository.findById(id).orElse(null));
    }

    public EventoDTO aggiornaEvento(Long id, EventoDTO eventoDTO) {
        Evento evento = eventoRepository.findById(id).get();
        if (eventoDTO.getNome() != null) {
            evento.setNome(eventoDTO.getNome());
        }
        if (eventoDTO.getData() != null) {
            evento.setData(eventoDTO.getData());
        }
        if (eventoDTO.getDescrizione() != null) {
            evento.setDescrizione(eventoDTO.getDescrizione());
        }
        if (eventoDTO.getPrezzo() != null) {
            evento.setPrezzo(eventoDTO.getPrezzo());
        }
        if (eventoDTO.getBigliettiDisponibili() != null) {
            evento.setBigliettiDisponibili(eventoDTO.getBigliettiDisponibili());
        }
        if (eventoDTO.getIdCategoria() != null) {
            evento.setCategoria(categoriaRepository.findById(eventoDTO.getIdCategoria()).get());
        }
        if (eventoDTO.getIdLocalita() != null) {
            evento.setLocalita(localitaRepository.findById(eventoDTO.getIdLocalita()).get());
        }
        eventoRepository.save(evento);
        return eventoMapper.toDto(evento);
    }


    public String eliminaEvento(Evento evento) {
        eventoRepository.delete(evento);
        return "eliminato correttamente";
    }

    public Evento eliminaPerID(Long id) {
        eventoRepository.deleteById(id);
        return null;
    }


}
