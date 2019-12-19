package br.com.caelum.capitulo04;

public class DesafioFibonacci_4_13_1 {
	
	public int calculaFibonacci(int n) {
		if (n < 2) {
			return n;
		}
		return calculaFibonacci(n - 1) + calculaFibonacci(n - 2); 
	}

}
