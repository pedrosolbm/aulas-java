package br.com.caelum.capitulo16;

import java.util.Collection;
import java.util.HashSet;

public class Exercicio_16_15_8_TestaBanco {

	public static void main(String[] args) {
		// declarando um HashMap de contas
		Collection<Conta> contas = new HashSet<>();

		// declarando um objeto do tipo ContaCorrente
		Conta cc1 = new ContaCorrente();

		// definindo atributos da ContaCorrente cc1
		cc1.setNumero(123);
		cc1.setCliente("diego");
		cc1.deposita(100);

		// declarando um objeto do tipo ContaCorrente
		Conta cc2 = new ContaCorrente();

		// definindo atributos da ContaCorrente cc2
		cc2.setNumero(123);
		cc2.setCliente("diego");
		cc2.deposita(100);

		// adicionando as contas correntes no hashMap Contas
		contas.add(cc1);
		contas.add(cc2);

		// enquanto houver um objeto conta dentro do hashMap contas
		for (Conta conta : contas) {
			// imprime a mensagem
			System.out
					.println(conta.getNumero() + " - " + conta.getCliente() + " cujo saldo é de R$" + conta.getSaldo());
		}
	}

}
