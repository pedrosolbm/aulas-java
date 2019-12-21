package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacaoArrayList {

	public static void main(String[] args) {

		// declarando um arrayList do tipo Contas
		List<ContaPoupanca> contas = new ArrayList<>();

		// criando um objeto do tipo ContaPoupança
		ContaPoupanca c1 = new ContaPoupanca();

		// definindo o numero da conta
		c1.setNumero(1973);

		// adicionando a conta no arrayList
		contas.add(c1);

		// criando um objeto do tipo ContaPoupança
		ContaPoupanca c2 = new ContaPoupanca();

		// definindo o numero da conta
		c2.setNumero(1462);

		// adicionando a conta no arrayList
		contas.add(c2);

		// criando um objeto do tipo ContaPoupança
		ContaPoupanca c3 = new ContaPoupanca();

		// definindo o numero da conta
		c3.setNumero(1854);

		// adicionando a conta no arrayList
		contas.add(c3);

		//ordenando as contas dentro do arrayList
		Collections.sort(contas);

		// conta de 0 até o tamno do arrayList contas
		for (int i = 0; i < contas.size(); i++) {
			// imprime o numero do cliente associado a conta i dentro da lista
			System.out.println("numero: " + contas.get(i).getNumero());
		}
	}

}
