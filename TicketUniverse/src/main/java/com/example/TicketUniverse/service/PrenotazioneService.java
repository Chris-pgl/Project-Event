package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.PrenotazioneDTO;
import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.enumerati.Status;
import com.example.TicketUniverse.mapper.PrenoMapper;
import com.example.TicketUniverse.model.Evento;
import com.example.TicketUniverse.model.Prenotazione;
import com.example.TicketUniverse.model.Utente;
import com.example.TicketUniverse.repositories.EventoRepository;
import com.example.TicketUniverse.repositories.PrenotazioneRepository;
import com.example.TicketUniverse.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private EventoRepository eventoRepository;
    @Autowired
    private PrenoMapper prenoMapper;
    public PrenotazioneDTO createPrenotazione(PrenotazioneDTO prenotazioneDTO){
        Evento e = eventoRepository.findById(prenotazioneDTO.getIdEvento()).get();
        Prenotazione prenotazione = prenoMapper.toEntity(prenotazioneDTO);
        prenotazione.setPrezzoTotale(prenotazione.getQuantitaPrenotata()*e.getPrezzo());
        prenotazione.setData(LocalDateTime.now());
        prenotazione.setIsConvalidata(false);
        prenotazione.setStatus(Status.ATTIVO);
        e.setBigliettiDisponibili(e.getBigliettiDisponibili()-prenotazione.getQuantitaPrenotata());
        eventoRepository.save(e);
        prenotazioneRepository.save(prenotazione);
        return prenoMapper.toDto(prenotazione);
    }
    public List<PrenotazioneDTO> getAllPrenotazioni(){
        List<Prenotazione> prenotazioni = prenotazioneRepository.findAll().stream().filter(u->u.getStatus().equals(Status.ATTIVO)).collect(Collectors.toList());
        List<PrenotazioneDTO> prenotazioniDto = prenoMapper.toDto(prenotazioni);
        return prenotazioniDto;
    }
//    public List<PrenotazioneDTO> getPrenotazioniByCodiceFiscaleUtente(String cf){
//        List<Prenotazione> prenotazioni = prenotazioneRepository.findAll().stream().filter(m->m.getUtente().getCodiceFiscale().equals(cf)).collect(Collectors.toList());
//        List<PrenotazioneDTO> prenotazioniDto = prenoMapper.toDto(prenotazioni);
//        return prenotazioniDto;
//    }
    public PrenotazioneDTO getPrenotazioneById(Long id){
        return prenoMapper.toDto( prenotazioneRepository.findById(id).get());
    }
    public PrenotazioneDTO updatePrenotazione(Long id, PrenotazioneDTO prenotazioneDTO){
        Prenotazione prenotazione = prenotazioneRepository.findById(id).get();
        if(prenotazioneDTO.getIdEvento()!=null){
            prenotazione.setEvento(eventoRepository.findById(prenotazioneDTO.getIdEvento()).get());
        }
        if (prenotazioneDTO.getIsConvalidata()!=null){
            prenotazione.setIsConvalidata(prenotazioneDTO.getIsConvalidata());
        }
        if (prenotazioneDTO.getData()!=null){
           prenotazione.setData(prenotazioneDTO.getData());
        }
        if (prenotazioneDTO.getIdUtente()!=null){
            prenotazione.setUtente(utenteRepository.findById(prenotazioneDTO.getIdEvento()).get());
        }
        if (prenotazioneDTO.getPrezzoTotale()!=null){
            prenotazione.setPrezzoTotale(prenotazione.getPrezzoTotale());
        }
        if(prenotazioneDTO.getQuantitaPrenotata()!=null){
            prenotazione.setQuantitaPrenotata(prenotazioneDTO.getQuantitaPrenotata());
        }

        prenotazioneRepository.save(prenotazione);
        return prenoMapper.toDto(prenotazione);
    }
    public String deletePrenotazione(Long id){
        Prenotazione prenotazione = prenotazioneRepository.findById(id).get();
        prenotazione.setStatus(Status.CANCELLATO);
        prenotazioneRepository.save(prenotazione);
        return "cancellato con successo";
    }
}
