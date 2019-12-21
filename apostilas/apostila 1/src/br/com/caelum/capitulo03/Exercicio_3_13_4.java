package br.com.caelum.capitulo03;

public class Exercicio_3_13_4 {

	public static void main(String[] args) {

		//declaração de variável, iniciando com valor 1
		int fatorial = 1;

		// contador de 1 até 10
		for (int n = 1; n <= 10; n++) {

			// fatorial recebe fatorial * n
			fatorial *= n;

			//imprime o fatorial
			System.out.println(fatorial);
		}
	}

}
