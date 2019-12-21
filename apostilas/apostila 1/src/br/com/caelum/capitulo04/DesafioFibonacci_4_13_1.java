package br.com.caelum.capitulo04;

public class DesafioFibonacci_4_13_1 {
	
	// metodo recursivo de calculo recebendo um paramentro int
	public int calculaFibonacci(int n) {
		//condição de parada, vai sair quando n for 1
		if (n < 2) {
			return n;
		}
		// retorno chamando a própria função
		return calculaFibonacci(n - 1) + calculaFibonacci(n - 2); 
	}
}
