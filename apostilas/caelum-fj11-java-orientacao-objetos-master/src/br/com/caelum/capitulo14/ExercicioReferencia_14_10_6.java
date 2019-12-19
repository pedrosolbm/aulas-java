package br.com.caelum.capitulo14;

import br.com.caelum.capitulo11.ContaPoupanca;

public class ExercicioReferencia_14_10_6 {

	public static void main(String[] args) {
		ContaPoupanca conta = new ContaPoupanca();
		
		conta.deposita(100);
		
		System.out.println(conta);

	}

}
