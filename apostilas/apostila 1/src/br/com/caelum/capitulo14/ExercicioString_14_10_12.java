package br.com.caelum.capitulo14;

public class ExercicioString_14_10_12 {

	public static void main(String[] args) {
		//decalrando uma string
		String s = "abc";
		for (int i = s.length() - 1; i >= 0; i--) {
			// imprime cada caracter da string em uma linha diferente
			System.out.println(s.charAt(i));
		}
	}

}
