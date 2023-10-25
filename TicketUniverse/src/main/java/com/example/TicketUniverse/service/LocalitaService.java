package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.LocalitaDTO;
import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.mapper.LocalitaMapper;
import com.example.TicketUniverse.model.Localita;
import com.example.TicketUniverse.model.Utente;
import com.example.TicketUniverse.repositories.LocalitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalitaService {
    @Autowired
    private LocalitaRepository localitaRepository;
    @Autowired
    private LocalitaMapper localitaMapper;

    public String createLocalita(LocalitaDTO localitaDTO) {
        localitaRepository.save(localitaMapper.toEntity(localitaDTO));
        return "salvato con successo";
    }

    public LocalitaDTO getLocalitaById(Long id) {
        return localitaMapper.toDto(localitaRepository.findById(id).get());
    }

    public List<LocalitaDTO> getAllLocalita() {
        List<Localita> localita = localitaRepository.findAll();
        List<LocalitaDTO> localitaDto = localitaMapper.toDto(localita);
        return localitaDto;
    }

    public String updateLocalita(Long id, LocalitaDTO localitaDTO) {
        Localita localita = localitaRepository.findById(id).get();
        if (localitaDTO.getCitta() != null) {
            localita.setCitta(localitaDTO.getCitta());
        }
        if (localitaDTO.getProvincia() != null) {
            localita.setProvincia(localitaDTO.getProvincia());
        }
        if (localitaDTO.getRegione() != null) {
            localita.setRegione(localitaDTO.getRegione());
        }
        if (localitaDTO.getIndirizzo() != null) {
            localita.setIndirizzo(localitaDTO.getIndirizzo());
        }

        localitaRepository.save(localita);
        return "aggiornato con successo ";
    }

    public String deleteLocalita(Long id) {
        localitaRepository.deleteById(id);
        return "cancellato con successo";
    }
}
