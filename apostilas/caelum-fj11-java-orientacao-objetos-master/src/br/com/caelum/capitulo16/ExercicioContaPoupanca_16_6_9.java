package br.com.caelum.capitulo16;

public class ExercicioContaPoupanca_16_6_9 extends ExercicioConta_16_6_9 implements Comparable<ExercicioContaPoupanca_16_6_9>{

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(ExercicioContaPoupanca_16_6_9 o) {
		return this.getCliente().compareTo(o.getCliente());
	}

}
