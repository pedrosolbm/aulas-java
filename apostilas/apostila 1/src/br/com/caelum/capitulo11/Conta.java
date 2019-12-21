package br.com.caelum.capitulo11;

//declarando uma classe abstrata Conta
public abstract class Conta {

	// declarando variaveis
	private int numero;
	protected double saldo;
	private String cliente;

	// gets e sets
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	// retorna uma mensagem com o valor do saldo
	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}

	// verifica se uma conta é igual a outra
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		// retorna true ou false, dependendo do objeto passado como parametro
		return ((this.numero == outraConta.numero) && (this.cliente == outraConta.cliente));
	}

	// adiciona valor ao saldo da conta
	public void deposita(double valor) {
		if (valor < 0) {
			// se o valor for menor que zero, da erro
			throw new ValorInvalidoException(valor);
		} else {
			// se não, soma o valor ao saldo da conta
			this.saldo += valor;
		}
	}

	// remove um valor do saldo da conta
	public void saca(double valor) {
		this.saldo -= valor;
	}

	// metodo abstrato
	public abstract void atualiza(double taxa);
}
