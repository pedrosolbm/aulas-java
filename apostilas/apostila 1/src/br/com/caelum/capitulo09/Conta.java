package br.com.caelum.capitulo09;

//declaração de classe abstrata 
public abstract class Conta {

	// declaração de variaveis
	protected double saldo;

	// metodo get
	public double getSaldo() {
		return this.saldo;
	}

	// adiciona valor ao saldo da conta
	public void deposita(double valor) {
		this.saldo += valor;
	}

	// remove valor ao saldo da conta
	public void saca(double valor) {
		this.saldo -= valor;
	}

	// atualiza o valor do saldo na conta
	public abstract void atualiza(double taxa);
}