package br.com.caelum.capitulo03;

public class Exercicio_3_13_2 {

	public static void main(String[] args) {

		// declaração de variável. iniciando com valor 0
		int soma = 0;

		// vai contar de 1 até 1000
		for(int i = 1; i <= 1000; i++) {

			//soma = valor atual da soma + o valor do contador
			soma += i;

			// imprime o valor da soma
			System.out.println(soma);
		}
	}

}
