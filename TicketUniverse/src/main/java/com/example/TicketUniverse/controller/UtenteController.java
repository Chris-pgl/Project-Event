package com.example.TicketUniverse.controller;

import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utente")
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping("/all")
    public @ResponseBody List<UtenteDTO> getAllUtenti(){
        return utenteService.getAllUtenti();
    }
    @GetMapping("/")
    public @ResponseBody UtenteDTO getUtenteByCodiceFiscale(@RequestParam String cf) {return utenteService.getUtenteByCodiceFiscale(cf);}
    @PostMapping("/add")
    public ResponseEntity<String> postUtente(@RequestBody UtenteDTO utenteDTO){
        return ResponseEntity.ok( utenteService.createUtente(utenteDTO));
    }
    @PutMapping("/modifica")
    public ResponseEntity<String> updateUtente(@RequestParam Long id, @RequestBody UtenteDTO utenteDTO){
        return ResponseEntity.ok( utenteService.updateUtente(id, utenteDTO));
    }
    @DeleteMapping("/cancella")
    public ResponseEntity<String > deleteUtente (@RequestParam Long id){
        return ResponseEntity.ok(utenteService.deleteUtente(id));
    }
}
