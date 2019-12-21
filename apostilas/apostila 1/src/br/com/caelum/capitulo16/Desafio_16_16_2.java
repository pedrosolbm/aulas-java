package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio_16_16_2 {

	public static void main(String[] args) {

		// declarando um array list
		List<Integer> lista = new ArrayList<>();

		// contando de 1 até 1000
		for (int i = 1; i <= 1000; i++) {
			// adicionando o numero na lista
			lista.add(i);
		}

		// ordenando em ordem decrescente
		Collections.reverse(lista);

		// imprimindo a lista
		System.out.println(lista);

	}

}
