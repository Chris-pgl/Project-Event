package com.example.TicketUniverse.mapper;

import com.example.TicketUniverse.dto.PrenotazioneDTO;
import com.example.TicketUniverse.model.Prenotazione;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface PrenoMapper extends EntityMapper<PrenotazioneDTO, Prenotazione> {
    @Override
    @Mapping(source = "idUtente", target = "utente.id")
    @Mapping(source = "idEvento", target = "evento.id")
    Prenotazione toEntity(PrenotazioneDTO dto);

    @Override
    @Mapping(source = "utente.id", target = "idUtente")
    @Mapping(source = "evento.id", target = "idEvento")
    PrenotazioneDTO toDto(Prenotazione entity);
}
