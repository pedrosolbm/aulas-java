package br.com.caelum.capitulo04;

public class DesafioFibonacci_4_13_3 {
	public int calculaFibonacci(int n) {
		return (n < 2) ? n : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
	}
}
