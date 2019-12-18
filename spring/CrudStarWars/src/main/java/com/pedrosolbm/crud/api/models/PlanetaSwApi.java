package com.pedrosolbm.crud.api.models;

import java.util.List;

public class PlanetaSwApi {

	private String name;

	private List<String> films;

	public PlanetaSwApi(String name, List<String> films) {
		this.name = name;
		this.films = films;
	}
}