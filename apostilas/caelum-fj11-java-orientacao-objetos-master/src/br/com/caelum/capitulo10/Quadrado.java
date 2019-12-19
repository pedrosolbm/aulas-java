package br.com.caelum.capitulo10;

public class Quadrado implements AreaCalculavel{
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double CalculaArea() {
		return this.lado * this.lado;
	}

}
