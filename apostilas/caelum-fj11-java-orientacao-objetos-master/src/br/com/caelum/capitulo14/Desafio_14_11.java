package br.com.caelum.capitulo14;

public class Desafio_14_11 {

	public static void main(String[] args) {
		String s = "762";
		int numero = 0;
		int total = 0;
		
		for (int i = s.length() - 1; i >= 0; i--) {
			numero = Character.getNumericValue(s.charAt(i));
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
