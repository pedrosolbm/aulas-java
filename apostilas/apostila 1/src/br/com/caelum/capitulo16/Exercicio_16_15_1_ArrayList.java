package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collection;

public class Exercicio_16_15_1_ArrayList {

	public static void main(String[] args) {
		// imprime uma mensagem
		System.out.println("Iniciando...");

		// decalrando uma ArrayList
		Collection<Integer> teste = new ArrayList<>();
		// pega o tempo em milisegundos
		long inicio = System.currentTimeMillis();

		int total = 30000;

		// conta de 0 até 30000
		for (int i = 0; i < total; i++) {
			// adiciona i na lista teste
			teste.add(i);
		}

		// conta de 0 até o 30000
		for (int i = 0; i < total; i++) {
			// verifica se a lista teste contem o valor i
			teste.contains(i);
		}

		// recebe o tempo em milisegundos
		long fim = System.currentTimeMillis();
		// calcula o tempo utilizado
		long tempo = fim - inicio;
		// imprime o valor do tempo
		System.out.println("Tempo gasto: " + tempo);
	}

}
