package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio_16_15_7_Banco {

	// declarando um arraylist de contas
	List<Conta> contas = new ArrayList<>();
	// declarando um hashmap que receberá uma String e um objeto Conta
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

	//sobreescrevendo metodos herdados
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contas == null) ? 0 : contas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercicio_16_15_7_Banco other = (Exercicio_16_15_7_Banco) obj;
		if (contas == null) {
			if (other.contas != null)
				return false;
		} else if (!contas.equals(other.contas))
			return false;
		return true;
	}

}
