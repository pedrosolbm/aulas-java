package br.com.caelum.capitulo10;

public interface ExercicioAvancadoConta {
	public double getSaldo();
	public void deposita(double valor);
	public void saca(double valor);
	public void atualiza(double taxaSelic);
}
