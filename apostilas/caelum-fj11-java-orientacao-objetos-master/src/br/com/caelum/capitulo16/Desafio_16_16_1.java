package br.com.caelum.capitulo16;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Desafio_16_16_1 {
	
	public static void main(String[] args) {
		Set<Integer> lista = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 1; i <= 1000; i++) {
			lista.add(i);
		}
		//lista em ordem decrescente
		System.out.println(lista + "\n");
		
	}
}
