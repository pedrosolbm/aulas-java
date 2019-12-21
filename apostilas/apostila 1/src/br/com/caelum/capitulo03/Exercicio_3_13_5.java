package br.com.caelum.capitulo03;

public class Exercicio_3_13_5 {

	public static void main(String[] args) {
		
		// declarando variavel long com tipo 1
		long fatorial = 1;

		//conta de 1 até 40
		for (int n = 1; n <= 40; n++) {

			//fatorial recebe fatorial * n
			fatorial *= n;

			//imprime o fatorial
			System.out.println(fatorial);
		}
	}

}
