package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio_16_15_6_Banco {

	// declarando um arraylist de contas
	List<Conta> contas = new ArrayList<>();

	// declarando um mapa de contas que armazena uma String e uma Conta
	Map<String, Conta> mapaDeContas = new HashMap<>();

	public void adiciona(Conta c) {
		// adiciona uma conta no array list
		this.contas.add(c);
		// adiciona uma conta no hashMap
		this.mapaDeContas.put(c.getCliente(), c);
	}

	public Conta pega(int x) {
		// retorna a conta armazeanda na posição solicitada
		return this.contas.get(x);
	}

	public int pegaQuantidadeDeContas() {
		// retorna o tamanho do arraylist
		return this.contas.size();
	}

	public Conta buscaPorCliente(String nome) {
		// retorna a conta que tiver o nome recebido como parametro
		return this.mapaDeContas.get(nome);
	}
}
