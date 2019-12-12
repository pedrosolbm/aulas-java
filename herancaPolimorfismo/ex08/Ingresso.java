package br.com.residencia.bin.ex08;

public class Ingresso {
	double valor;
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String imprimeValor() {
		
		return "O valor do ingresso é: R$"+valor+" reais";
		
	}
}
