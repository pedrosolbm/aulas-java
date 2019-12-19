package com.pedrosolbm.crud.api.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import com.pedrosolbm.crud.api.models.Planeta;
import com.pedrosolbm.crud.api.repositories.PlanetaRepository;
import com.pedrosolbm.crud.api.services.PlanetaService;

@Service
public class PlanetaServiceImpl implements PlanetaService {

	@Autowired
	private PlanetaRepository planetaRepository;

	private static final String SWAPI_URL = "https://swapi.co/api/planets/?search=";

	@Override
	public Planeta criarPlaneta(Planeta planeta) {
		Integer qtd = this.obterQtdAparicoes(planeta.getNome());
		if (qtd == null) {
			return null;
		}
		planeta.setQntAparicoes(qtd);
		return planetaRepository.save(planeta);
	}

	private Integer obterQtdAparicoes(String name) {
		StringBuilder completeUrl = new StringBuilder();
		completeUrl.append(SWAPI_URL).append(name);

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

		Object object;
		try {
			object = restTemplate.exchange(completeUrl.toString(), HttpMethod.GET,
					new HttpEntity<String>("parameters", headers), Object.class);
		} catch (Exception e) {
			return null;
		}

		Gson gson = new Gson();
		JsonArray results = gson.fromJson(gson.toJson(object), JsonObject.class).getAsJsonObject("body")
				.getAsJsonArray("results");

		JsonElement correctResult = null;

		for (JsonElement e : results) {
			if (e.getAsJsonObject().get("name").getAsString().equalsIgnoreCase(name)) {
				correctResult = e;
			}
		}

		if (correctResult == null) {
			return 0;
		} else {
			return correctResult.getAsJsonObject().getAsJsonArray("films").size();
		}
	}

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