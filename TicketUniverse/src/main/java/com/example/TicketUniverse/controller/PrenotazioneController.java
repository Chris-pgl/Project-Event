package com.example.TicketUniverse.controller;

import com.example.TicketUniverse.dto.PrenotazioneDTO;
import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prenotazione")
public class PrenotazioneController {
    @Autowired
    private PrenotazioneService prenotazioneService;

    @GetMapping("/all")
    public @ResponseBody List<PrenotazioneDTO> getAllPrenotazioni() {
        return prenotazioneService.getAllPrenotazioni();
    }

//    @GetMapping("/")
//    public @ResponseBody List<PrenotazioneDTO> getPrenotazioniByCodiceFiscale(@RequestParam String cf) {
//        return prenotazioneService.getPrenotazioniByCodiceFiscaleUtente(cf);
//    }
    @GetMapping("{id}")
    public @ResponseBody PrenotazioneDTO getPrenotazioneById(@PathVariable Long id){
        return prenotazioneService.getPrenotazioneById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<PrenotazioneDTO> postPrenotazione(@RequestBody PrenotazioneDTO prenotazioneDTO) {
        return ResponseEntity.ok(prenotazioneService.createPrenotazione(prenotazioneDTO));
    }

    @PutMapping("/modifica")
    public ResponseEntity<PrenotazioneDTO> updatePrenotazione(@RequestParam Long id, @RequestBody PrenotazioneDTO prenotazioneDTO) {
        return ResponseEntity.ok(prenotazioneService.updatePrenotazione(id, prenotazioneDTO));
    }

    @DeleteMapping("/cancella")
    public ResponseEntity<String> deletePrenotazione(@RequestParam Long id) {
        return ResponseEntity.ok(prenotazioneService.deletePrenotazione(id));
    }
}

