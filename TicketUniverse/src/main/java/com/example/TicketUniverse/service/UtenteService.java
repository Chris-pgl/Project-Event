package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.enumerati.Status;
import com.example.TicketUniverse.mapper.UtenteMapper;
import com.example.TicketUniverse.model.Utente;
import com.example.TicketUniverse.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private UtenteMapper utenteMapper;

    public UtenteDTO createUtente(UtenteDTO utenteDTO) {
        Utente utente = utenteMapper.toEntity(utenteDTO);
        utenteRepository.save(utente);
        return utenteMapper.toDto(utente);
    }

    public List<UtenteDTO> getAllUtentiAttivi() {
        List<Utente> utenti = utenteRepository.findAll().stream().filter(u->u.getStatus().equals(Status.ATTIVO)).collect(Collectors.toList());
        List<UtenteDTO> utentiDto = utenteMapper.toDto(utenti);
        return utentiDto;
    }


    public UtenteDTO getUtenteByCodiceFiscale(String cf) {
        Utente utente = utenteRepository.findByCodiceFiscale(cf);
        UtenteDTO utenteDTO = utenteMapper.toDto(utente);
        return utenteDTO;
    }

    public UtenteDTO updateUtente(Long id, UtenteDTO utenteDTO) {
        Utente utente = utenteRepository.findById(id).get();
        if (utenteDTO.getNome() != null) {
            utente.setNome(utenteDTO.getNome());
        }
        if (utenteDTO.getCognome() != null) {
            utente.setCognome(utenteDTO.getCognome());
        }
        if (utenteDTO.getEmail() != null) {
            utente.setEmail(utenteDTO.getEmail());
        }
        if (utenteDTO.getPassword() != null) {
            utente.setPassword(utenteDTO.getPassword());
        }
        if (utenteDTO.getCodiceFiscale() != null) {
            utente.setCodiceFiscale(utenteDTO.getCodiceFiscale());
        }
        utenteRepository.save(utente);
        return utenteMapper.toDto(utente);
    }

    public String deleteUtente(Long id) {
        Utente utente = utenteRepository.findById(id).get();
        utente.setStatus(Status.CANCELLATO);
        utenteRepository.save(utente);
        return "cancellato con successo";
    }

    public UtenteDTO getUtenteById(Long id) {
        return utenteMapper.toDto(utenteRepository.findById(id).get());
    }
}
