package com.example.TicketUniverse.mapper;

import org.mapstruct.Mapper;


import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.model.Utente;


@Mapper(componentModel = "spring")
public interface UtenteMapper extends EntityMapper<UtenteDTO, Utente> {

    @Override
    UtenteDTO toDto(Utente utente);

    @Override
    Utente toEntity(UtenteDTO utenteDTO);

}
