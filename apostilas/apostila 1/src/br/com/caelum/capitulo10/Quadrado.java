package br.com.caelum.capitulo10;

//a classe quadrado herda metodos da interface AreaCalculavel
public class Quadrado implements AreaCalculavel{
	
	//declarando variaveis
	private int lado;
	
	//construtor da calsse quadrado 
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	//sobreescrevendo metodo herdado
	@Override
	public double CalculaArea() {
		return this.lado * this.lado;
	}

}
