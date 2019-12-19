package br.com.caelum.capitulo10;

public class ExercicioAvancadoContaCorrente implements ExercicioAvancadoConta {
	private double saldo;
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 2;
	}

}
