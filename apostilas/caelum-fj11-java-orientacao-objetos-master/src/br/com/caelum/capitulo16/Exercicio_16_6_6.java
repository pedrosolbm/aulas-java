package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio_16_6_6 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
		
		//inverte a ordem de uma lista
		//Collections.reverse(lista);
		
		//Embaralha os elementos de uma lista
		//Collections.shuffle(lista);
		
		//Rotaciona os elementos de uma lista
		Collections.rotate(lista, 3);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

	}

}
