package br.com.caelum.capitulo11;

public abstract class Conta {
	private int numero;
	protected double saldo;
	private String cliente;

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
	
	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}
	
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return ((this.numero == outraConta.numero) && (this.cliente == outraConta.cliente));
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public abstract void atualiza(double taxa);
}
