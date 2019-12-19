package br.com.caelum.capitulo03;

public class Exercicio_3_13_7 {

	public static void main(String[] args) {
		int x = 13;
		
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			System.out.print(x + "->");
		}
	}

}
