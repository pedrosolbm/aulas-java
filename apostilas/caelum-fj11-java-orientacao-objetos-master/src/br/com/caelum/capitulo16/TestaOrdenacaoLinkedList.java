package br.com.caelum.capitulo16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaOrdenacaoLinkedList {

	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<>();
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1973);
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1462);
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(1854);
		contas.add(c3);
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			System.out.println("numero: " + contas.get(i).getNumero());
		}

	}

}
