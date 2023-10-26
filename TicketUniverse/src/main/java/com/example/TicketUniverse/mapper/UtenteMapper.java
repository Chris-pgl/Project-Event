package com.example.TicketUniverse.mapper;

import org.mapstruct.Mapper;


import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.model.Utente;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = PrenoMapper.class)
public interface UtenteMapper extends EntityMapper<UtenteDTO, Utente> {
    @Override
    UtenteDTO toDto(Utente utente);
    @Override
    Utente toEntity(UtenteDTO utenteDTO);

}
