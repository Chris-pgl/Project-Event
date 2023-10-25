package com.example.TicketUniverse.mapper;

import com.example.TicketUniverse.dto.PrenotazioneDTO;
import com.example.TicketUniverse.model.Prenotazione;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PrenotazioneMapper extends EntityMapper<PrenotazioneDTO, Prenotazione> {
    @Override
    PrenotazioneDTO toDto(Prenotazione prenotazione);
    @Override
    Prenotazione toEntity(PrenotazioneDTO prenotazioneDTO);
}
