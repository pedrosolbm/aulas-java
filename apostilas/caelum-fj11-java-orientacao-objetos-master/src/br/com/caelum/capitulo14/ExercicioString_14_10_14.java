package br.com.caelum.capitulo14;

public class ExercicioString_14_10_14 {

	public static void main(String[] args) {
		//declarando uma string
		String palavra = "Socorram-me, subi no onibus em Marrocos";
		//declara um vetor que vai receber dividir a string inteira em palavras separadas por espaços
		String[] palavras = palavra.split(" ");
		
		for (int i = palavras.length - 1; i >= 0; i--) {
			//imprime as palavras separadas por espaço em uma mesma linha
			System.out.print(palavras[i] + " ");
		}

	}

}
