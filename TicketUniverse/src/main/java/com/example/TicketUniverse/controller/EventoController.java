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
    public @ResponseBody String creaEvento(@RequestBody EventoDTO eventoDTO){
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

//    @PutMapping("{id}")
//    public ResponseEntity<EventoDTO> updateEvento(@PathVariable Long id, @RequestBody EventoDTO eventoDTO){
//        EventoDTO eventoEsistente = eventoService.eventoPerId(id);
//        if (eventoEsistente != null){
//            Evento updateEvento = eventoService.aggiornaEvento(eventoEsistente, eventoDTO);
//            EventoDTO salvaEvento = eventoService.salvaEvento(updateEvento);
//            return new ResponseEntity<>(salvaEvento, HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEvento(@PathVariable Long id){
        Evento evento = eventoService.eliminaPerID(id);
        return ResponseEntity.ok(  eventoService.eliminaEvento(evento));
//        if (evento != null){
//            eventoService.eliminaEvento(evento);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }else{
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }

    }







}
