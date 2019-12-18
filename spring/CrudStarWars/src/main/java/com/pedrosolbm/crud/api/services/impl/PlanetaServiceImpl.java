package com.pedrosolbm.crud.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pedrosolbm.crud.api.models.Planeta;
import com.pedrosolbm.crud.api.repositories.PlanetaRepository;
import com.pedrosolbm.crud.api.services.PlanetaService;

import okhttp3.*;

// teste de request
import org.json.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class PlanetaServiceImpl implements PlanetaService {

	@Autowired
	private PlanetaRepository planetaRepository;

	private final OkHttpClient httpClient = new OkHttpClient();

	private static final String URL_API = "https://swapi.co/api/planets/";

	// essa porra aqui tem que mandar uma requisição pra ApiSW
	@Override
	public List<Planeta> getPlanetas() {
		System.out.println("GET /planets");
		Request request = new Request.Builder().url(URL_API).build();
		try (Response response = httpClient.newCall(request).execute()) {
			if (!response.isSuccessful())
				throw new IOException("Unexpected code " + response);
			// Get response body
			String jsonData = response.body().string();
			System.out.println(jsonData);
			
			JSONObject Jobject = new JSONObject(jsonData);

			JSONArray Jarray = Jobject.getJSONArray("results");
			
			
			for (int i = 0; i < Jarray.length(); i++) {
				JSONObject object = Jarray.getJSONObject(i);
				String nome= object.getString("name");
				String clima= object.getString("climate");
				String terreno= object.getString("terrain");
				JSONArray Jfilms = object.getJSONArray("films");
				int aparicao = Jfilms.length();
				
				System.out.println("nome: " + nome + " \t clima: "+ clima + " \t terreno: "+ terreno + " \t APARECEU: "+ aparicao);
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

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
