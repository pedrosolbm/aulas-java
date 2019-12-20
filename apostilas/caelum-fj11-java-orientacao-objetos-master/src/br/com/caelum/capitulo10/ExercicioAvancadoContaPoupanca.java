package br.com.caelum.capitulo10;

//classe ExercicioAvancadoContaPoupanca herdando metodos da interface ExercicioAvancadoConta
public class ExercicioAvancadoContaPoupanca implements ExercicioAvancadoConta {
	private double saldo;

	//sobreescrevendo metodos herdados
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
		this.saldo += this.saldo * taxaSelic * 3;
	}

}
