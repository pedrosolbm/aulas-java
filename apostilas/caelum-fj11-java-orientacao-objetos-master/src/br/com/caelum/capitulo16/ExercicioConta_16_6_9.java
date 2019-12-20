package br.com.caelum.capitulo16;

public abstract class ExercicioConta_16_6_9 {

	// declarando variaveis da classe
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

	// verifica se uam conta é igual a outra
	public boolean equals(Object obj) {
		ExercicioConta_16_6_9 outraConta = (ExercicioConta_16_6_9) obj;
		return ((this.numero == outraConta.numero) && (this.cliente == outraConta.cliente));
	}

	// deposita um valor na conta
	public void deposita(double valor) {
		// se o valor for menor que 0
		if (valor < 0) {
			// da erro
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	// remove valor do saldo da conta
	public void saca(double valor) {
		this.saldo -= valor;
	}

	// metodo abstratao para atualizar o saldo
	public abstract void atualiza(double taxa);
}
