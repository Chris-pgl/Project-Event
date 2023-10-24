package com.example.TicketUniverse.controller;

import com.example.TicketUniverse.dto.UtenteDTO;
import com.example.TicketUniverse.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

}
