package com.pedrosolbm.crud.api.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Planeta {

	// Atributos do planeta

	@Id
	private String id;

	@Indexed(unique=true)
	@NotNull
	private String nome;

	private String clima;

	private String terreno;

	private int qntAparicoes;

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

//	@NotEmpty(message = "clima nao pode ser vazio ")
	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

//	@NotEmpty(message = "Terreno nao pode ser vazio ")
	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public int getQntAparicoes() {
		return qntAparicoes;
	}

	public void setQntAparicoes(int qntAparicoes) {
		this.qntAparicoes = qntAparicoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planeta other = (Planeta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
