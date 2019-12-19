package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio_16_15_7_Banco {

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
