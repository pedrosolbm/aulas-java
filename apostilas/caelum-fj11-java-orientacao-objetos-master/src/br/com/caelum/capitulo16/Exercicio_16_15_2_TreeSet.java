package br.com.caelum.capitulo16;

import java.util.TreeSet;

public class Exercicio_16_15_2_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> lista = new TreeSet<>();
		
		lista.add(122);
		lista.add(245);
		lista.add(345);
		lista.add(453);
		lista.add(500);
		
		System.out.println("Menor elemento da lista: " + lista.first());
		
		System.out.println("Maior elemento da lista: " + lista.last());
	}

}
