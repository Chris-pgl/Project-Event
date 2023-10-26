package com.example.TicketUniverse.model;

import java.util.List;
import java.util.Objects;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	@OneToMany(mappedBy = "categoria")
	private List<Evento> eventi;

	public Categoria() {
	}

	public Categoria(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

}
