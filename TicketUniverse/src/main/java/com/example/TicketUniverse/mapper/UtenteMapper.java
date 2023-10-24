package com.example.TicketUniverse.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.model.Utente;

@Mapper(componentModel = "spring")
public interface UtenteMapper extends EntityMapper<UtenteDTO, Utente> {

    UtenteDTO toDto(Utente utente);

    Utente toEntity(UtenteDTO utenteDTO);
}
