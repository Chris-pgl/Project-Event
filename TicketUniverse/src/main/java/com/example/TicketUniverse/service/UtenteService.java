package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.mapper.UtenteMapper;
import com.example.TicketUniverse.model.Utente;
import com.example.TicketUniverse.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private UtenteMapper utenteMapper;

    public List<UtenteDTO> getAllUtenti(){
        List<Utente> utenti = utenteRepository.findAll();
        List<UtenteDTO> utentiDto = utenteMapper.toDto(utenti);
        
        return utentiDto;
    }
}
