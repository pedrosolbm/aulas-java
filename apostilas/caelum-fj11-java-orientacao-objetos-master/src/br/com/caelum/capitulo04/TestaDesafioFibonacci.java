package br.com.caelum.capitulo04;

public class TestaDesafioFibonacci {

	public static void main(String[] args) {

		// declara um objeto do tipo DesafioFibonacci_4_13_1;
		DesafioFibonacci_4_13_1 fibonacci = new DesafioFibonacci_4_13_1();

		// conta de 1 até 6
		for (int i = 1; i <= 6; i++) {

			// resultado recebe o resultado da da chamada do metodo calculaFibonacci(i) do
			// objeto fibonacci
			int resultado = fibonacci.calculaFibonacci(i);
			// imprime o numero da sequencia separado por virgula
			System.out.print(resultado + ",");
		}
	}

}
