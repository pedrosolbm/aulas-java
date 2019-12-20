package br.com.caelum.capitulo10;

import br.com.caelum.capitulo10.Conta;

// contaPoupança herda atributos e metodos da classe Conta
public class ContaPoupanca extends Conta {

	// sobreescrevendo metodo herdado
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

}
