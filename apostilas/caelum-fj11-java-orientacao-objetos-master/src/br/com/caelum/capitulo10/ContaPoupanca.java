package br.com.caelum.capitulo10;

import br.com.caelum.capitulo10.Conta;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

}
