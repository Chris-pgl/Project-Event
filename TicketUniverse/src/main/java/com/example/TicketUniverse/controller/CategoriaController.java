package com.example.TicketUniverse.controller;

import com.example.TicketUniverse.dto.CategoriaDTO;
import com.example.TicketUniverse.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/all")
    public @ResponseBody List<CategoriaDTO> getAllCategoria(){
        return categoriaService.getAllCategoria();
    }
    @GetMapping("/{id}")
    public @ResponseBody CategoriaDTO getCategoriaById(Long id){
        return categoriaService.getCategoriaById(id);
    }
    @PutMapping("/")
    public ResponseEntity<CategoriaDTO> updateCategoriaById(@PathVariable Long id, @RequestBody CategoriaDTO categoriaDTO){
        return ResponseEntity.ok(categoriaService.aggiornaCategoria(id, categoriaDTO));
    }
    @DeleteMapping("/cancella")
    public ResponseEntity<String> deleteCategoria(Long id){
        return ResponseEntity.ok(categoriaService.cancellaCategoriaById(id));
    }
}
