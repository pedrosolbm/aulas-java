package com.pedrosolbm.crud.api.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pedrosolbm.crud.api.services.PlanetaService;
import com.pedrosolbm.crud.api.events.RecursoCriadoEvent;
import com.pedrosolbm.crud.api.models.Planeta;
import com.pedrosolbm.crud.api.repositories.PlanetaRepository;
import com.pedrosolbm.crud.api.responses.Response;

@RestController
@RequestMapping(path = "/api")
public class PlanetaController {

	@Autowired
	private PlanetaService planetaService;

	@Autowired
	PlanetaRepository planetaRepository;

	@Autowired
	private ApplicationEventPublisher publisher;

	@GetMapping(path = "/planetas")
	public ResponseEntity<Response<List<Planeta>>> listarTodos() {
		return ResponseEntity.ok(new Response<List<Planeta>>(this.planetaService.listarTodos()));
	}

	@GetMapping(path = "planetas/id/{id}")
	public ResponseEntity<Response<Optional<Planeta>>> listarPorId(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(new Response<Optional<Planeta>>(this.planetaService.listarPorId(id)));
	}

	@GetMapping(path = "planetas/nome/{nome}")
	public ResponseEntity<Response<List<Planeta>>> listaPorNome(@PathVariable(name = "nome") String nome) {
		return ResponseEntity.ok(new Response<List<Planeta>>(this.planetaService.listarPorNome(nome)));
	}

	//Cria o planeta sem fazer a verificação de filmes na api
//	@PostMapping(path = "/planetas")
//	public ResponseEntity<Response<Planeta>> cadastrar(@Valid @RequestBody Planeta planeta, BindingResult resultado) {
//		// verifica se houve erros ao tentar cadastrar um planeta
//		if (resultado.hasErrors()) {
//			// gera um arraylist de erros
//			List<String> erros = new ArrayList<String>();
//			// cada erro gerado será adicionado na lista de erros
//			resultado.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//			// retorna erro 400 e a lista de erros para o usário
//			return ResponseEntity.badRequest().body(new Response<Planeta>(erros));
//		}
//		// retorna o planeta cadastrado
//		return ResponseEntity.ok(new Response<Planeta>(this.planetaService.cadastrar(planeta)));
//	}

	@PutMapping(path = "planetas/id/{id}")
	public ResponseEntity<Response<Planeta>> atualizar(@PathVariable(name = "id") String id,
			@Valid @RequestBody Planeta planeta, BindingResult resultado) {
		if (resultado.hasErrors()) {
			// gera um arraylist de erros
			List<String> erros = new ArrayList<String>();
			// cada erro gerado será adicionado na lista de erros
			resultado.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			// retorna erro 400 e a lista de erros para o usário
			return ResponseEntity.badRequest().body(new Response<Planeta>(erros));
		}
		planeta.setId(id);
		// retorna o planeta atualizado
		return ResponseEntity.ok(new Response<Planeta>(this.planetaService.atualizar(planeta)));
	}

	@DeleteMapping(path = "planetas/id/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id) {
		this.planetaService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

	@PostMapping(path="/planetas")
	public ResponseEntity<Planeta> savePlaneta(@Valid @RequestBody Planeta planeta, HttpServletResponse response) {
		Planeta planetaSalvo = planetaService.criarPlaneta(planeta);
		if (planetaSalvo != null) {
			publisher.publishEvent(new RecursoCriadoEvent(this, response, planeta.getId()));
			return ResponseEntity.status(HttpStatus.CREATED).body(planetaSalvo);
		} else {
			return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
		}

	}

}
