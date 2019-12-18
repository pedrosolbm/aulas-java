package com.pedrosolbm.crud.api.models;

import javax.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Planeta {

	// Atributos do planeta

	@Id
	private String id;

	private String nome;

	private String clima;

	private String terreno;

	// Construtor vazio
	public Planeta() {
	}

	// getters e setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotEmpty(message = "Nome nao pode ser vazio ")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty(message = "clima nao pode ser vazio ")
	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	@NotEmpty(message = "Terreno nao pode ser vazio ")
	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

}
