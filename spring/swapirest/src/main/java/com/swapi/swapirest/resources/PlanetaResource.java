package com.swapi.swapirest.resources;

import java.util.List;

import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.swapi.swapirest.repository.PlanetaRepository;
import com.swapi.swapirest.models.Planeta;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STAR WARS")
@CrossOrigin(origins = "*")

public class PlanetaResource {

	@Autowired
	PlanetaRepository planetaRepository;

	@GetMapping("/planetas")
	@ApiOperation(value = "Retorna uma lista de planetas")
	public List<Planeta> listaPlanetas() {
		return planetaRepository.findAll();
	}

	@GetMapping("/planeta/{id}")
	@ApiOperation(value = "Retorna um planeta unico")
	public Planeta listaPlanetaUnico(@PathVariable(value = "id") long id) {
		return planetaRepository.findById(id);
	}

	@GetMapping("/planeta/{nome}")
	@ApiOperation(value = "Retorna um unico planeta com o nome digitado")
	public Planeta listaPlanetas(@PathVariable(value = "nome") String nome) {
		return planetaRepository.findByName(nome);
	}

	@GetMapping("/planeta")
	@ApiOperation(value = "Insere um planeta")
	public Planeta salvaPlaneta(@RequestBody Planeta planeta) {
		return planetaRepository.save(planeta);
	}

	@GetMapping("/planeta")
	@ApiOperation(value = "Deleta um planeta")
	public void deletaPlaneta(@RequestBody Planeta planeta) {
		planetaRepository.delete(planeta);
	}

	@GetMapping("/planeta")
	@ApiOperation(value = "Atualiza um planeta")
	public Planeta atualizaPlaneta(@RequestBody Planeta planeta) {
		return planetaRepository.save(planeta);
	}
}
