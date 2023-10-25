package com.example.TicketUniverse.mapper;

import com.example.TicketUniverse.dto.LocalitaDTO;
import com.example.TicketUniverse.model.Localita;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocalitaMapper extends EntityMapper<LocalitaDTO, Localita> {
    @Override
    LocalitaDTO toDto(Localita localita);
    @Override
    Localita toEntity(LocalitaDTO localitaDTO);
}
