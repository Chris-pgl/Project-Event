package com.example.TicketUniverse.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	private Long id;
	private LocalDateTime data;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int bigliettiDisponibili;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "id_localita")
	private Localita localita;

	public Evento() {
	}

	public Evento(Long id, LocalDateTime data, String nome, String descrizione, double prezzo, int bigliettiDisponibili,
			Categoria categoria, Localita localita) {
		this.id = id;
		this.data = data;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.bigliettiDisponibili = bigliettiDisponibili;
		this.categoria = categoria;
		this.localita = localita;
	}
	
	
}
