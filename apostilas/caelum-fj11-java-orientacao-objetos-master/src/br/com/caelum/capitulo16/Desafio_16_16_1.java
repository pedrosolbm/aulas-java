package br.com.caelum.capitulo16;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Desafio_16_16_1 {

	public static void main(String[] args) {
		// declarando uma TreeSet ordenada ao contrário
		Set<Integer> lista = new TreeSet<>(Collections.reverseOrder());

		// conta de 1 até 1000
		for (int i = 1; i <= 1000; i++) {
			// adiciona o numero na lista
			lista.add(i);
		}
		// lista em ordem decrescente
		System.out.println(lista + "\n");

	}
}
