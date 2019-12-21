package br.com.caelum.capitulo16;

//classe ExercicioContaPoupanca_16_6_9 herda metodos e atributos da classe ExercicioConta_16_6_9 e da Interface ExercicioContaPoupanca_16_6_9
public class ExercicioContaPoupanca_16_6_9 extends ExercicioConta_16_6_9
		implements Comparable<ExercicioContaPoupanca_16_6_9> {

	// sobreescrevendo metodos herdados
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(ExercicioContaPoupanca_16_6_9 o) {
		return this.getCliente().compareTo(o.getCliente());
	}

}
