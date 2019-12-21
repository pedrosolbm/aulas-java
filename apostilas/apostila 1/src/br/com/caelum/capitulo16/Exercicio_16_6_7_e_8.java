package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio_16_6_7_e_8 {

	public static void main(String[] args) {
		// declarando uma lista do tipo ContaPoupança
		List<ContaPoupanca> contas = new ArrayList<>();

		// Declarando uma variável que recebe um numero aleatório
		Random numeroAleatorio = new Random();

		// criando objeto ContaPoupanca
		ContaPoupanca c1 = new ContaPoupanca();
		// numero da conta vai ser um numero inteiro entre 0 e 100
		c1.setNumero(numeroAleatorio.nextInt(100));

		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(numeroAleatorio.nextInt(100));

		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(numeroAleatorio.nextInt(100));

		// adicionando as contas na lista de contas
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);

		// ordenando as contas por numero
		Collections.sort(contas);

		// conta de 0 até o tamnho da lista de contas
		for (int i = 0; i < contas.size(); i++) {
			// imprime o numero das contas
			System.out.println(contas.get(i).getNumero());
		}
	}
}
