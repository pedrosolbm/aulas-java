package com.pedrosolbm.crud.api.services;

import java.util.List;
import java.util.Optional;

import com.pedrosolbm.crud.api.models.Planeta;

public interface PlanetaService {

	// Lista todos os planetas do banco
	List<Planeta> listarTodos();

	// Salva o planeta pesquisado na Api e retona a quantidade de apariÃ§oes
	Planeta criarPlaneta(Planeta planeta);

	// Lista os planetas por Id
	Optional<Planeta> listarPorId(String id);

	// Lista os PLanetas do Banco por Nome
	List<Planeta> listarPorNome(String nome);

	// cadastra um planeta novo no banco passando nome
	Planeta cadastrar(Planeta planeta);

	// atualiza dados de um planeta no banco
	Planeta atualizar(Planeta planeta);

	// deleta o planeta do banco
	void remover(String id);

}
