package br.com.caelum.capitulo10;

//declaração da classe
public class GerenciadorDeImpostoDeRenda {
	
	//declarando variaveis
	private double total;
	

	//retorna o valor do imposto de renda
	public double getTotal() {
		return this.total;
	}
	
	// adiciona um objeto Tributavel
	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);
		this.total += t.calculaTributos();                
	}
}
