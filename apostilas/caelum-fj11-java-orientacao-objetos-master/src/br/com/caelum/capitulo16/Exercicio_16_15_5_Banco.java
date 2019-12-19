package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.List;

public class Exercicio_16_15_5_Banco {
	List<Conta> contas = new ArrayList<>();
	
	public void adiciona(Conta c) {
		this.contas.add(c);
	}
	
	public Conta pega(int x) {
		return this.contas.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}

}
