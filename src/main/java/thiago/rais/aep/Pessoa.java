package thiago.rais.aep;

import java.util.Scanner;
import java.util.UUID;

public class Pessoa {
	private UUID id;
	private String nome = "";

	
	// METODO APRESENTAR NOME
	public String getName() {
		return nome;
	}
	
	// METODO APRESENTAR ID
	public UUID getId() {
		return id;
	}
	
	// METODO CONSTRUTOR
	public Pessoa (String nome) {
		this.nome = nome;
		id = UUID.randomUUID();
	}
	
	// METODO CONSTRUTOR
	public Pessoa (UUID id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
}

