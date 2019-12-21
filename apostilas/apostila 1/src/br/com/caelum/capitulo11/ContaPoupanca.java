package br.com.caelum.capitulo11;

import br.com.caelum.capitulo11.Conta;

// classe ContaPoupança herda metodos e atributos da classe Conta
public class ContaPoupanca extends Conta {

	// sobreescrevendo metodos herdados
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

}
