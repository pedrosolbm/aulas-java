package com.pedrosolbm.crud.api.services;

import java.util.List;
import java.util.Optional;

import com.pedrosolbm.crud.api.models.Planeta;

public interface PlanetaService {

	List<Planeta> listarTodos();
	
	Optional<Planeta> listarPorId(String id);
	
	List<Planeta> listarPorNome(String nome);
	
//	Planeta criaPlanetas(Planeta planetas);
	
	Planeta cadastrar(Planeta planeta);
	
	Planeta atualizar(Planeta planeta);
	
	void remover(String id);
	
}
