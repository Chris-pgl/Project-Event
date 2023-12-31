package com.example.TicketUniverse.controller;

import com.example.TicketUniverse.dto.PrenotazioneDTO;
import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "localhost:4200")
@RequestMapping("/utente")
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping("/all")
    public @ResponseBody List<UtenteDTO> getAllUtenti(){
        return utenteService.getAllUtentiAttivi();
    }
    @GetMapping("{id}")
    public @ResponseBody UtenteDTO getUtenteById(@PathVariable Long id){
        return utenteService.getUtenteById(id);
    }
    @GetMapping("/")
    public @ResponseBody UtenteDTO getUtenteByCodiceFiscale(@RequestParam String cf) {return utenteService.getUtenteByCodiceFiscale(cf);}
    @PostMapping("/add")
    public ResponseEntity<UtenteDTO> postUtente(@RequestBody UtenteDTO utenteDTO){
        return ResponseEntity.ok( utenteService.createUtente(utenteDTO));
    }
    @PutMapping("/modifica")
    public ResponseEntity<UtenteDTO> updateUtente(@RequestParam Long id, @RequestBody UtenteDTO utenteDTO){
        return ResponseEntity.ok( utenteService.updateUtente(id, utenteDTO));
    }
    @DeleteMapping("/cancella")
    public void deleteUtente (@RequestParam Long id){
        utenteService.deleteUtente(id);
    }
}
