package com.example.TicketUniverse.mapper;

import com.example.TicketUniverse.dto.CategoriaDTO;
import com.example.TicketUniverse.model.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends EntityMapper<CategoriaDTO, Categoria>{
    @Override
    CategoriaDTO toDto(Categoria entity);
    @Override
    Categoria toEntity(CategoriaDTO dto);
}
