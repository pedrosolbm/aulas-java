package br.com.caelum.capitulo16;

import br.com.caelum.capitulo16.Conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return Integer.compare(this.getNumero(), o.getNumero());
	}

}
