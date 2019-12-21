package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.List;

public class Exercicio_16_15_5_Banco {

	// declarando um arrayListo que armazena objetos do tipo Conta
	List<Conta> contas = new ArrayList<>();

	// adicona uma conta no arrayList
	public void adiciona(Conta c) {
		this.contas.add(c);
	}

	// retorna a conta x do array list
	public Conta pega(int x) {
		return this.contas.get(x);
	}

	// retorna a quantidade de contas armazenadas no array list
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}

}
