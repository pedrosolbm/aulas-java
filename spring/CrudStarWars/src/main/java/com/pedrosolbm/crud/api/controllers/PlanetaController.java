package com.pedrosolbm.crud.api.controllers;

//import para poder utilizar ArrayList
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

// para poder utilizar a anotação autowired
import org.springframework.beans.factory.annotation.Autowired;
//para utilizar o metodo de listagem 
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
//para poder utilizar a anotação getMapping
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//para utilizar a anotação requestMapping
import org.springframework.web.bind.annotation.RequestMapping;

//para utilizar a anotação restController
import org.springframework.web.bind.annotation.RestController;

// importando o arquivo planeta service
import com.pedrosolbm.crud.api.services.PlanetaService;
import com.pedrosolbm.crud.api.models.Planeta;
import com.pedrosolbm.crud.api.responses.Response;

@RestController
@RequestMapping(path = "/api/planetas")
public class PlanetaController {

	@Autowired
	private PlanetaService planetaService;

	private static final String API_URL="https://swapi.co/api/planets/";
	
	String charset= "UTF-8";
	
	
	@GetMapping
	public ResponseEntity<Response<List<Planeta>>> listarTodos() {
		return ResponseEntity.ok(new Response<List<Planeta>>(this.planetaService.listarTodos()));
	}

	@GetMapping(path = "/id/{id}")
	public ResponseEntity<Response<Optional<Planeta>>> listarPorId(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(new Response<Optional<Planeta>>(this.planetaService.listarPorId(id)));
	}

	@GetMapping(path="/nome/{nome}")
	public ResponseEntity<Response<List<Planeta>>> listaPorNome(@PathVariable(name="nome") String nome){
		return ResponseEntity.ok(new Response<List<Planeta>>(this.planetaService.listarPorNome(nome)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Planeta>> cadastrar(@Valid @RequestBody Planeta planeta, BindingResult resultado) {
		// verifica se houve erros ao tentar cadastrar um planeta
		if (resultado.hasErrors()) {
			// gera um arraylist de erros
			List<String> erros = new ArrayList<String>();
			// cada erro gerado será adicionado na lista de erros
			resultado.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));

			// retorna erro 400 e a lista de erros para o usário
			return ResponseEntity.badRequest().body(new Response<Planeta>(erros));
		}
		return ResponseEntity.ok(new Response<Planeta>(this.planetaService.cadastrar(planeta)));
	}

	@PutMapping(path = "/id/{id}")
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
		return ResponseEntity.ok(new Response<Planeta>(this.planetaService.atualizar(planeta)));
	}

	@DeleteMapping(path = "/id/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id) {
		this.planetaService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

}
