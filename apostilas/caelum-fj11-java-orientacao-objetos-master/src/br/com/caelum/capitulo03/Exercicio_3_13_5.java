package br.com.caelum.capitulo03;

public class Exercicio_3_13_5 {

	public static void main(String[] args) {
		long fatorial = 1;
		for (int n = 1; n <= 40; n++) {
			fatorial *= n;
			System.out.println(fatorial);
		}
	}

}
