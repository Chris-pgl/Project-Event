package com.example.TicketUniverse.controller;

import com.example.TicketUniverse.dto.LocalitaDTO;
import com.example.TicketUniverse.service.LocalitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localita")
public class LocalitaController {
    @Autowired
    private LocalitaService localitaService;
    @PostMapping("/add")
    public ResponseEntity<String> createLocalita(@RequestBody LocalitaDTO localitaDTO){
        return ResponseEntity.ok( localitaService.createLocalita(localitaDTO));
    }
    @GetMapping("/all")
    public @ResponseBody List<LocalitaDTO> getAllLocalita(){
        return localitaService.getAllLocalita();
    }
    @GetMapping("/{id}")
    public @ResponseBody LocalitaDTO getLocalitaById(@PathVariable Long id){
        return localitaService.getLocalitaById(id);
    }
    @PutMapping("/modifica")
    public ResponseEntity<String> updateLocalita(@RequestParam Long id, @RequestBody LocalitaDTO localitaDTO){
        return ResponseEntity.ok(localitaService.updateLocalita(id, localitaDTO));
    }
    @DeleteMapping("/cancella")
    public ResponseEntity<String> deleteLocalita(@RequestParam Long id){
        return ResponseEntity.ok(localitaService.deleteLocalita(id));
    }
}
