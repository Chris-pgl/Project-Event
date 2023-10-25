package com.example.TicketUniverse.mapper;

import com.example.TicketUniverse.dto.EventoDTO;
import com.example.TicketUniverse.model.Evento;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventoMapper extends EntityMapper<EventoDTO, Evento>{

        @Override
        @Mapping(source = "categoria.id", target = "idCategoria")
		@Mapping(source = "localita.id", target = "idLocalita")
        EventoDTO toDto(Evento evento);

        @Override
        @Mapping(source = "idCategoria", target = "categoria.id")
		@Mapping(source = "idLocalita", target = "localita.id")
        Evento toEntity(EventoDTO eventoDTO);

}
