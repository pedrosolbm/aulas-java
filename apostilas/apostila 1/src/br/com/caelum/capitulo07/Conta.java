package br.com.caelum.capitulo07;

// declarando a classe conta
public class Conta {
	// declarando variaveis
	protected double saldo;

	// metodo get
	public double getSaldo() {
		return this.saldo;
	}

	// metodo para inserir valor ao saldo da conta
	public void deposita(double valor) {
		this.saldo += valor;
	}

	// metodo para remover valor do saldo
	public void saca(double valor) {
		this.saldo -= valor;
	}

	// metodo para atualizar o saldo da conta
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
}
