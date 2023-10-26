package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.LocalitaDTO;
import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.enumerati.Status;
import com.example.TicketUniverse.mapper.LocalitaMapper;
import com.example.TicketUniverse.model.Localita;
import com.example.TicketUniverse.model.Prenotazione;
import com.example.TicketUniverse.model.Utente;
import com.example.TicketUniverse.repositories.LocalitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocalitaService {
    @Autowired
    private LocalitaRepository localitaRepository;
    @Autowired
    private LocalitaMapper localitaMapper;

    public LocalitaDTO createLocalita(LocalitaDTO localitaDTO) {
        Localita localita = localitaMapper.toEntity(localitaDTO);
        localitaRepository.save(localita);
        return localitaMapper.toDto(localita);
    }

    public LocalitaDTO getLocalitaById(Long id) {
        return localitaMapper.toDto(localitaRepository.findById(id).get());
    }

    public List<LocalitaDTO> getAllLocalita() {
        List<Localita> localita = localitaRepository.findAll().stream().filter(u->u.getStatus().equals(Status.ATTIVO)).collect(Collectors.toList());
        List<LocalitaDTO> localitaDto = localitaMapper.toDto(localita);
        return localitaDto;
    }

    public LocalitaDTO updateLocalita(Long id, LocalitaDTO localitaDTO) {
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
        return localitaMapper.toDto(localita);
    }

    public String deleteLocalita(Long id) {
        Localita localita = localitaRepository.findById(id).get();
        localita.setStatus(Status.CANCELLATO);
        localitaRepository.save(localita);
        return "cancellato con successo";
    }
}
