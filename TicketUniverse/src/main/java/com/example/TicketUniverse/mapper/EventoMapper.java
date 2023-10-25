package com.example.TicketUniverse.mapper;

import com.example.TicketUniverse.dto.EventoDTO;
import com.example.TicketUniverse.model.Evento;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventoMapper extends EntityMapper<EventoDTO, Evento>{

        @Override
        EventoDTO toDto(Evento evento);

        @Override
        Evento toEntity(EventoDTO eventoDTO);



}
