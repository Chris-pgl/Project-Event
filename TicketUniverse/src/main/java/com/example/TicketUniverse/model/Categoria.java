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
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
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
