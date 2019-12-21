package br.com.caelum.capitulo09;


// classe conta Poupança herda atributos e metodos da classe pai Conta
public class ContaPoupanca extends Conta {

	// sobreescrevendo o metodo herdado da classe pai
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

}
