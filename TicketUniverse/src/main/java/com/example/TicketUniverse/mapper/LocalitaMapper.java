package com.example.TicketUniverse.mapper;

import com.example.TicketUniverse.dto.LocalitaDTO;
import com.example.TicketUniverse.model.Localita;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocalitaMapper extends EntityMapper<LocalitaDTO, Localita> {
    LocalitaDTO toDto(Localita localita);
    Localita toEntity(LocalitaDTO localitaDTO);
}
