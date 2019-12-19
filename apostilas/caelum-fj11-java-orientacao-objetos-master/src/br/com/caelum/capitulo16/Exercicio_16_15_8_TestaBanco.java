package br.com.caelum.capitulo16;

import java.util.Collection;
import java.util.HashSet;

public class Exercicio_16_15_8_TestaBanco {

	public static void main(String[] args) {
		Collection<Conta> contas = new HashSet<>();

		Conta cc1 = new ContaCorrente();
		cc1.setNumero(123);
		cc1.setCliente("diego");
		cc1.deposita(100);
		
		Conta cc2 = new ContaCorrente();
		cc2.setNumero(123);
		cc2.setCliente("diego");
		cc2.deposita(100);
		
		contas.add(cc1);
		contas.add(cc2);
		
		for (Conta conta : contas) {
			System.out.println(conta.getNumero() + " - " + conta.getCliente() + " cujo saldo é de R$" + conta.getSaldo());
		}
	}

}
