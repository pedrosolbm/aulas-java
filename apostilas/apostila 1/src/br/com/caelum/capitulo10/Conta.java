package br.com.caelum.capitulo10;

//declarando a classe abstrata Conta
public abstract class Conta {

	// declarando variaveis da classe
	protected double saldo;

	// retorna o saldo da conta
	public double getSaldo() {
		return this.saldo;
	}

	// soma um valor ao saldo da conta
	public void deposita(double valor) {
		this.saldo += valor;
	}

	// remove um valor ao saldo da conta
	public void saca(double valor) {
		this.saldo -= valor;
	}

	//metodo abstrato atualiza utilizando um parametro double
	public abstract void atualiza(double taxa);
}
