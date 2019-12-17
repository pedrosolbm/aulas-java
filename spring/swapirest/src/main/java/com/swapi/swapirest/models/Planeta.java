package com.swapi.swapirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "planetas")

public class Planeta implements Serializable {

	private static final long serialVersionUID = 1;

	// atributos do planeta

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	// @NotNull
	private String nome;

	// @NotNull
	private String clima;

	// @NotNull
	private String terreno;

	private int aparicao;

	public Planeta() {
	}

	public Planeta(long id, String nome, String clima, String terreno, int aparicao) {
		this.id = id;
		this.nome = nome;
		this.clima = clima;
		this.terreno = terreno;
		this.aparicao = aparicao;
	}

	// gets e sets dos atributos do planeta
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public int getAparicao() {
		return aparicao;
	}

	public void setAparicao(int aparicao) {
		this.aparicao = aparicao;
	}

}
