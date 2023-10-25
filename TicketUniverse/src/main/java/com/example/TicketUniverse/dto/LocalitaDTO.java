package com.example.TicketUniverse.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import java.util.List;
@Data
public class LocalitaDTO {

    private String regione;
    private String provincia;
    private String citta;
    private String indirizzo;

}
