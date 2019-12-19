package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercicio_16_15_4 {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
		List<Integer> teste = new ArrayList<>();
		//List<Integer> teste = new LinkedList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		for (int i = 0; i < 30000; i++) {
			teste.get(i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim-inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
	}

}
