package br.com.caelum.capitulo16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaOrdenacaoLinkedList {

	public static void main(String[] args) {

		// criando uma LinkList que armazenara objetos do tipo ContaPoupança
		List<ContaPoupanca> contas = new LinkedList<>();

		// criando um objeto do tipo ContaPoupança
		ContaPoupanca c1 = new ContaPoupanca();

		// deifindo um numero a conta
		c1.setNumero(1973);

		// adicionando a conta na LinkedList
		contas.add(c1);

		// criando um objeto do tipo ContaPoupança
		ContaPoupanca c2 = new ContaPoupanca();

		// deifindo um numero a conta
		c2.setNumero(1462);

		// adicionando a conta na LinkedList
		contas.add(c2);

		// criando um objeto do tipo ContaPoupança
		ContaPoupanca c3 = new ContaPoupanca();

		// deifindo um numero a conta
		c3.setNumero(1854);

		// adicionando a conta na LinkedList
		contas.add(c3);

		// ordenando as contasPoupanças dentro da lista por ordem crescente
		Collections.sort(contas);

		// conta de 0 até o ultimo objeto dentro da lista
		for (int i = 0; i < contas.size(); i++) {
			// imrpime o numero da conta i dentro da lista
			System.out.println("numero: " + contas.get(i).getNumero());
		}

	}

}
