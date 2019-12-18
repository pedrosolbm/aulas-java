package com.pedrosolbm.crud.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrosolbm.crud.api.documents.Planeta;
import com.pedrosolbm.crud.api.repositories.PlanetaRepository;
import com.pedrosolbm.crud.api.services.PlanetaService;

@Service
public class ClienteServiceImpl implements PlanetaService {

	@Autowired
	private PlanetaRepository planetaRepository;

	@Override
	public List<Planeta> listarTodos() {
		return this.planetaRepository.findAll();
	}

	@Override
	public Optional<Planeta> listarPorId(String id) {
		return this.planetaRepository.findById(id);
	}

	@Override
	public List<Planeta> listarPorNome(String nome) { 
		return this.planetaRepository.findByNome(nome);
	}

	@Override
	public Planeta cadastrar(Planeta planeta) {
		return this.planetaRepository.save(planeta);
	}

	@Override
	public Planeta atualizar(Planeta planeta) {
		return this.planetaRepository.save(planeta);
	}

	@Override
	public void remover(String id) {
		this.planetaRepository.deleteById(id);

	}

}
