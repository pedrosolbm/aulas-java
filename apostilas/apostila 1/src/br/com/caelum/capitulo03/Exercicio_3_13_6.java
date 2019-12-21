package br.com.caelum.capitulo03;

public class Exercicio_3_13_6 {

	public static void main(String[] args) {

		// declaração de variaveis
		int atual = 0;
		int anterior = 1;
		int fibonacci = 0;

		// enquanto fibonacci for menor 100
		while (fibonacci <= 100) {

			// se a variavel fibonacci for zero
			if (fibonacci == 0)
				// imprime o numero da sequencia de fibonacci junto com uma virgula
				System.out.print(fibonacci + ",");

			// fibonacci recebe o numero atual + o numero anterior
			fibonacci = atual + anterior;

			// imprime o numero da sequencia de fibonacci junto com uma virgula
			System.out.print(fibonacci + ",");

			// numero anterior recebe o numero atual
			anterior = atual;

			// o numero atual recebe o numero da sequencia de fibonacci
			atual = fibonacci;
		}

	}

}
