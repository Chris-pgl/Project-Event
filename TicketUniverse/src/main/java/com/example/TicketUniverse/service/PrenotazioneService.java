package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.PrenotazioneDTO;
import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.mapper.PrenoMapper;
import com.example.TicketUniverse.model.Prenotazione;
import com.example.TicketUniverse.model.Utente;
import com.example.TicketUniverse.repositories.EventoRepository;
import com.example.TicketUniverse.repositories.PrenotazioneRepository;
import com.example.TicketUniverse.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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
    public String createPrenotazione(PrenotazioneDTO prenotazioneDTO){
        Prenotazione prenotazione = prenoMapper.toEntity(prenotazioneDTO);
        prenotazioneRepository.save(prenotazione);
        return "salvato con successo";
    }
    public List<PrenotazioneDTO> getAllPrenotazioni(){
        List<Prenotazione> prenotazioni = prenotazioneRepository.findAll();
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
    public String updatePrenotazione(Long id, PrenotazioneDTO prenotazioneDTO){
        Prenotazione prenotazione = prenotazioneRepository.findById(id).get();
        if(prenotazioneDTO.getIdEvento()!=null){
            prenotazione.setEvento(eventoRepository.findById(prenotazioneDTO.getIdEvento()).get());
        }
        if (prenotazioneDTO.getConvalidata()!=null){
            prenotazione.setConvalidata(prenotazioneDTO.getConvalidata());
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
        return "aggiornato con successo ";
    }
    public String deletePrenotazione(Long id){
        prenotazioneRepository.deleteById(id);
        return "cancellato con successo";
    }
}
