package br.com.caelum.capitulo14;

public class ExercicioString_14_10_14 {

	public static void main(String[] args) {
		String palavra = "Socorram-me, subi no ônibus em Marrocos";
		String[] palavras = palavra.split(" ");
		
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.print(palavras[i] + " ");
		}

	}

}
