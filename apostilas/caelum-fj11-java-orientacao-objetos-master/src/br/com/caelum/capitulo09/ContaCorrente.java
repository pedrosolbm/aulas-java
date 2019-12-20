package br.com.caelum.capitulo09;

// classe conta corrente herda atributos e metodos da classe pai Conta
public class ContaCorrente extends Conta {

	// sobreescrevendo o metodo herdado da classe pai
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
	
}
