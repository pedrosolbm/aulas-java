package br.com.caelum.capitulo03;

public class Exercicio_3_13_8 {

	public static void main(String[] args) {

		// contador de 1 até 4
		for (int i = 1; i <= 4; i++) {

			// contador de 1 até o numero do contador acima
			for (int j = 1; j <= i; j++) {

				// imprime o valor de 1xj junto com um espaço
				System.out.print(i * j + " ");
			}

			// imprime um espaço em branco e pula linha
			System.out.println(" ");
		}
	}

}
