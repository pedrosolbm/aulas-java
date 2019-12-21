package br.com.caelum.capitulo10;

//a classe Retangulo herda metodos da interface AreaCalculavel
public class Retangulo implements AreaCalculavel {
	// declarando variaveis
	private int largura;
	private int altura;

	//construtor da classe
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	// sobreescrevendo metodo herdado
	@Override
	public double CalculaArea() {
		return this.largura * this.altura;
	}

}
