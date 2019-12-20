package br.com.caelum.capitulo16;

import java.util.TreeSet;

public class Exercicio_16_15_2_TreeSet {

	public static void main(String[] args) {

		// decalrando um objeto do tipo TreeSet que armazena inteiros
		TreeSet<Integer> lista = new TreeSet<>();

		// adicionando valores na lista
		lista.add(122);
		lista.add(245);
		lista.add(345);
		lista.add(453);
		lista.add(500);

		/* o TreeSet ordena a lista automaticamente após a inclusão */

		// imprime o menor numero
		System.out.println("Menor elemento da lista: " + lista.first());

		// imprime o maior numero
		System.out.println("Maior elemento da lista: " + lista.last());
	}

}
