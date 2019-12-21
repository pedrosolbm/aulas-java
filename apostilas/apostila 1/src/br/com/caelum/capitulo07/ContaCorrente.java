package br.com.caelum.capitulo07;

//a classe contaCorrente herda metodos e atributos da classe Conta
public class ContaCorrente extends Conta {
	//sobreescrevendo o método herdado de Conta
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}

	//Sobreescrevendo o metodo herdado de conta
	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
}
