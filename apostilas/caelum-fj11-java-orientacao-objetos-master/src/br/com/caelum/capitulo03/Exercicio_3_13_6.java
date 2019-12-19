package br.com.caelum.capitulo03;

public class Exercicio_3_13_6 {

	public static void main(String[] args) {
		int atual = 0;
		int anterior = 1;
		int fibonacci = 0;
		
		while (fibonacci <= 100) {
			if (fibonacci == 0) 
				System.out.print(fibonacci + ",");
			fibonacci = atual + anterior;
			System.out.print(fibonacci + ",");
			anterior = atual;
			atual = fibonacci;
		}

	}

}
