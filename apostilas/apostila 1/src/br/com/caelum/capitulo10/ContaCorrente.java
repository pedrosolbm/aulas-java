package br.com.caelum.capitulo10;

import br.com.caelum.capitulo10.Conta;

//Classe ContaCorrente herda metodos e atributos de Conta e da Interface Tributavel
public class ContaCorrente extends Conta implements Tributavel {

	// sobreescrevendo os metodos herdados
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}
