package br.com.caelum.capitulo14;

import br.com.caelum.capitulo11.ContaPoupanca;

public class ExercicioReferencia_14_10_6 {

	public static void main(String[] args) {
		// criando um objeto do tipo ContaPoupança
		ContaPoupanca conta = new ContaPoupanca();
		
		// adiciona saldo na conta
		conta.deposita(100);
		
		//imprime os dados da conta
		System.out.println(conta);

	}

}
