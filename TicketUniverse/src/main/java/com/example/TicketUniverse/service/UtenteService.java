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
    public String createUtente(UtenteDTO utenteDTO){
        Utente utente = utenteMapper.toEntity(utenteDTO);
        utenteRepository.save(utente);
        return "salvato con successo";
    }
    public List<UtenteDTO> getAllUtenti(){
        List<Utente> utenti = utenteRepository.findAll();
        List<UtenteDTO> utentiDto = utenteMapper.toDto(utenti);
        return utentiDto;
    }
    public UtenteDTO getUtenteByCodiceFiscale(String cf){
        Utente utente = utenteRepository.findByCodiceFiscale(cf);
        UtenteDTO utenteDTO = utenteMapper.toDto(utente);
        return utenteDTO;
    }
    public String updateUtente(Long id, UtenteDTO utenteDTO){
        Utente utente = utenteRepository.findById(id).get();
        if(utenteDTO.getNome()!=null){
            utente.setNome(utenteDTO.getNome());
        }
        if (utenteDTO.getCognome()!=null){
            utente.setCognome(utenteDTO.getCognome());
        }
        if (utenteDTO.getEmail()!=null){
            utente.setEmail(utenteDTO.getEmail());
        }
        if (utenteDTO.getPassword()!=null){
            utente.setPassword(utenteDTO.getPassword());
        }
        if (utenteDTO.getCodiceFiscale()!=null){
            utente.setCodiceFiscale(utenteDTO.getCodiceFiscale());
        }
        utenteRepository.save(utente);
        return "aggiornato con successo ";
    }
    public String deleteUtente(Long id){
        utenteRepository.deleteById(id);
        return "cancellato con successo";
    }
}
