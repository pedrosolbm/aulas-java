package br.com.caelum.capitulo16;

import br.com.caelum.capitulo16.Conta;

//conta poupança herda atributos e metodos da classe conta e da interface Comparable
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	//sobreescrevendo metodos herdados
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return Integer.compare(this.getNumero(), o.getNumero());
	}

}
