package br.com.caelum.capitulo14;

public class Desafio_14_11 {

	public static void main(String[] args) {

		//Declarando Variaveis
		String s = "762";
		int numero = 0;
		int total = 0;
		
		//contando de 0 até o tamanho da String S
		for (int i = s.length() - 1; i >= 0; i--) {
			// pega o numero da string digitada na posição 
			numero = Character.getNumericValue(s.charAt(i));
			// a variavel vai receber o tamanho da string - i
			int variavel = s.length() - i;
			while (variavel > 1) {
				numero = numero * 10;
				variavel--;
			}
			total = numero + total;
		}
		System.out.println(total);
	}

}
