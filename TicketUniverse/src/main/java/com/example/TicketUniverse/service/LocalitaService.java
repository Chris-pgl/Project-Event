package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.LocalitaDTO;
import com.example.TicketUniverse.mapper.LocalitaMapper;
import com.example.TicketUniverse.repositories.LocalitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalitaService {
    @Autowired
    private LocalitaRepository localitaRepository;
    @Autowired
    private LocalitaMapper localitaMapper;

    public String createLocalita(LocalitaDTO localitaDTO){
        localitaRepository.save(localitaMapper.toEntity( localitaDTO));
        return "salvato con successo";
    }
}
