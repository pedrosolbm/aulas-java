package br.com.caelum.capitulo10;

public class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;
	
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double CalculaArea() {
		return this.largura * this.altura;
	}

}
