package com.example.TicketUniverse.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Localita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_localita")
	private Long id;
	
	private String regione; 
	private String provincia; 
	private String citta;
	private String indirizzo;
	
	@OneToMany(mappedBy = "localita")
	private List<Evento> eventi;
	
	public Localita() {
	}

	public Localita(Long id, String regione, String provincia, String citta, String indirizzo) {
		this.id = id;
		this.regione = regione;
		this.provincia = provincia;
		this.citta = citta;
		this.indirizzo = indirizzo;
	}
	
}
