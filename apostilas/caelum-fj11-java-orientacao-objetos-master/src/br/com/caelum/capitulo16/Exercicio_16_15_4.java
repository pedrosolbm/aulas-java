package br.com.caelum.capitulo16;

import java.util.ArrayList;

import java.util.List;

public class Exercicio_16_15_4 {

	public static void main(String[] args) {
		// imprime uma mensagem
		System.out.println("Iniciando...");

		// pega o tempo em milisegundos
		long inicio = System.currentTimeMillis();

		// declarando um arrayList
		List<Integer> teste = new ArrayList<>();

		// conta de 0 até 30000
		for (int i = 0; i < 30000; i++) {
			// adiciona 0, i na lista teste
			teste.add(0, i);
		}
		// conta de 0 até o 30000
		for (int i = 0; i < 30000; i++) {
			// retorna o valor de que estiver armazenado na posição i do array list
			teste.get(i);
		}
		// recebe o tempo em milisegundos
		long fim = System.currentTimeMillis();

		// calcula o tempo utilizado
		double tempo = (fim - inicio) / 1000.0;

		// imprime o tempo gasto
		System.out.println("Tempo gasto: " + tempo);
	}

}
