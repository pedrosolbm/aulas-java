package com.swapi.swapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swapi.swapirest.models.Planeta;

public interface PlanetaRepository extends JpaRepository<Planeta, Long> {
	
	public Planeta findById(long id);
	public Planeta findByName(String nome);

}
