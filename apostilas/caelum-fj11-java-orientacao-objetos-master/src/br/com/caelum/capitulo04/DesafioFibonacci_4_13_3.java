package br.com.caelum.capitulo04;

public class DesafioFibonacci_4_13_3 {

	// metodo recursivo de calculo recebendo um paramentro int
	public int calculaFibonacci(int n) {

		// função arrow. se n for menor que 2, retorna n, se não, chama a função
		// novamente
		return (n < 2) ? n : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
	}
}
