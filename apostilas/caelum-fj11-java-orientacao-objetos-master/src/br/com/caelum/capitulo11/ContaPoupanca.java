package br.com.caelum.capitulo11;

import br.com.caelum.capitulo11.Conta;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

}
