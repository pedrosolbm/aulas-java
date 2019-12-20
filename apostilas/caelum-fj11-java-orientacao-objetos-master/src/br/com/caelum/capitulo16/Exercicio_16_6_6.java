package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio_16_6_6 {

	public static void main(String[] args) {

		// declarando uma lista de Strings
		List<String> lista = new ArrayList<>();

		// adicionando uma string na lista
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");

		// inverte a ordem de uma lista
		// Collections.reverse(lista);

		// Embaralha os elementos de uma lista
		// Collections.shuffle(lista);

		// Rotaciona os elementos de uma lista
		Collections.rotate(lista, 3);

		// conta de zero até o tamnho da lista
		for (int i = 0; i < lista.size(); i++) {
			// imprime a string na posição i da lista
			System.out.println(lista.get(i));
		}

	}

}
