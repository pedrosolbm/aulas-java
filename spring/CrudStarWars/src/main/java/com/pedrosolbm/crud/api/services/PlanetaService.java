package com.pedrosolbm.crud.api.services;

import java.util.List;
import java.util.Optional;

import com.pedrosolbm.crud.api.models.Planeta;

public interface PlanetaService {

	List<Planeta> listarTodos();
	
	List<Planeta> getPlanetas(); // teste do metodo GET
	
	Optional<Planeta> listarPorId(String id);
	
	List<Planeta> listarPorNome(String nome);
	
	Planeta cadastrar(Planeta planeta);
	
	Planeta atualizar(Planeta planeta);
	
	void remover(String id);
	
}
