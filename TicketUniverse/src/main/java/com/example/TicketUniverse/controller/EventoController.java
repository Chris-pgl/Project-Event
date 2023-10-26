package com.example.TicketUniverse.controller;

import com.example.TicketUniverse.dto.EventoDTO;
import com.example.TicketUniverse.model.Evento;
import com.example.TicketUniverse.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/evento/")
public class EventoController {

    @Autowired
    private EventoService eventoService;


    @GetMapping("all")
    public @ResponseBody List<EventoDTO> getAllEvent(){
        return eventoService.getAllEvent();
    }


    @PostMapping("crea")
    public @ResponseBody EventoDTO creaEvento(@RequestBody EventoDTO eventoDTO){
        return eventoService.creaEvento(eventoDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<EventoDTO> getEventoId(@PathVariable Long id){
        EventoDTO evento = eventoService.eventoPerId(id);
        if (evento != null){
            return new ResponseEntity<>(evento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("modifica")
    public ResponseEntity<EventoDTO> modiificaEvento(@RequestParam Long id, @RequestBody EventoDTO eventoDTO){
        return ResponseEntity.ok(eventoService.aggiornaEvento(id, eventoDTO));
    }


    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEvento(@PathVariable Long id){
        return ResponseEntity.ok(  eventoService.eliminaPerID(id));
    }







}
