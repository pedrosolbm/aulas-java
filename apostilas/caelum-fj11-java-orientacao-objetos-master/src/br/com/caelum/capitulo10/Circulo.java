package br.com.caelum.capitulo10;

// Criando classe Circulo que implementa metodos da Interface AreaCalculavel
public class Circulo implements AreaCalculavel {

	// declarando variaveis da classe
	private double raio;

	// metodos da classe

	// definindo o raio do circulo
	public Circulo(double raio) {
		this.raio = raio;
	}

	// sobreescrevendo os metodos herdados da interface
	@Override
	public double CalculaArea() {
		return Math.PI * raio * raio;
	}

}
