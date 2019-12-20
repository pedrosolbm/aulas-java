package br.com.caelum.capitulo16;

//declarando uma classe abstrada
public abstract class ContaExercicio_16_6_9 {
	
	//declarando variaveis
	private int numero;
	protected double saldo;
	private String cliente;

	//ets e sets
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
		
	public void deposita(double valor) {
		//se o valor depositado for menor que zero, dá erro
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
