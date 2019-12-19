package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio_16_16_2 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 1; i <= 1000; i++) {
			lista.add(i);
		}
		
		Collections.reverse(lista);
		
		System.out.println(lista);

	}

}
