package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio_16_15_6_Banco {
	List<Conta> contas = new ArrayList<>();
	Map<String, Conta> mapaDeContas = new HashMap<>();
	
	public void adiciona(Conta c) {
		this.contas.add(c);
		this.mapaDeContas.put(c.getCliente(), c);
	}
	
	public Conta pega(int x) {
		return this.contas.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorCliente(String nome) {
		return this.mapaDeContas.get(nome);
	}
}
