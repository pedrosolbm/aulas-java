package br.com.caelum.capitulo03;

public class Desafio_3_14 {

	public static void main(String[] args) {
		for (int fibonacci = 0, auxiliar = 1; fibonacci <= 100; auxiliar += fibonacci, fibonacci = auxiliar - fibonacci) {
			System.out.print(fibonacci + ",");
		}
	}

}
