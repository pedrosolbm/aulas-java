package br.com.caelum.capitulo03;

public class Exercicio_3_13_7 {

	public static void main(String[] args) {

		// declarando variaveis
		int x = 13;

		// enquanto x for diferente de 1
		while (x != 1) {

			// se x for par
			if (x % 2 == 0) {

				// x recebe x dividido por 2
				x = x / 2;

				// se não
			} else {
				// x recebe x dividido por 3
				x = 3 * x + 1;
			}
			// imprime x
			System.out.print(x + "->");
		}
	}

}
