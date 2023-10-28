package com.example.TicketUniverse.service;

import com.example.TicketUniverse.dto.CategoriaDTO;
import com.example.TicketUniverse.enumerati.Status;
import com.example.TicketUniverse.mapper.CategoriaMapper;
import com.example.TicketUniverse.model.Categoria;
import com.example.TicketUniverse.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private CategoriaMapper categoriaMapper;
    public CategoriaDTO creaCategoria(CategoriaDTO categoriaDTO){
        Categoria categoria = categoriaMapper.toEntity(categoriaDTO);
        categoria.setStatus(Status.ATTIVO);
        categoriaRepository.save(categoria);
        return categoriaMapper.toDto(categoria);
    }
    public CategoriaDTO aggiornaCategoria(Long id, CategoriaDTO categoriaDTO){
        Categoria categoria = categoriaRepository.findById(id).get();
        if (categoriaDTO.getNome()!=null){
            categoria.setNome(categoriaDTO.getNome());
        }
        categoriaRepository.save(categoria);
        return categoriaMapper.toDto(categoria);
    }
    public List<CategoriaDTO> getAllCategoria(){
        List<Categoria> categorie = categoriaRepository.findAll().stream().filter(u->u.getStatus().equals(Status.ATTIVO)).collect(Collectors.toList());
        List<CategoriaDTO> categorieDTO = categoriaMapper.toDto(categorie);
        return categorieDTO;
    }
    public CategoriaDTO getCategoriaById(Long id){
        Categoria categoria = categoriaRepository.findById(id).get();
        return categoriaMapper.toDto( categoria);
    }
    public String cancellaCategoriaById(Long id){
        Categoria categoria = categoriaRepository.findById(id).get();
        categoria.setStatus(Status.CANCELLATO);
        categoriaRepository.save(categoria);
        return "cancellato con successo";
    }
}
