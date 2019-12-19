package br.com.caelum.capitulo03;

public class Exercicio_3_13_8 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println(" ");
		}
	}

}
