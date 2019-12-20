package br.com.caelum.capitulo10;

// criando uma interface
public interface ExercicioAvancadoConta {

	// declarando metodos da interface
	public double getSaldo();

	public void deposita(double valor);

	public void saca(double valor);

	public void atualiza(double taxaSelic);
}
