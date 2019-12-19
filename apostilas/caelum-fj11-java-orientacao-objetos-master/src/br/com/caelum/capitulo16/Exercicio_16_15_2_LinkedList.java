package br.com.caelum.capitulo16;

import java.util.LinkedList;

public class Exercicio_16_15_2_LinkedList {

	public static void main(String[] args) {
		LinkedList lista = new LinkedList();
		
		lista.add("Segundo");
		lista.add("Terceiro");
		lista.add("Quarto");
		
		lista.addFirst("Primeiro");
		lista.addLast("Ultimo");
		
		System.out.println(lista);
	}

}
