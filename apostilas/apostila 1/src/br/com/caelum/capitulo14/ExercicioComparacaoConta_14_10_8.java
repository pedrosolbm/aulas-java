package br.com.caelum.capitulo14;

import br.com.caelum.capitulo11.ContaCorrente;
import br.com.caelum.capitulo11.ContaPoupanca;

public class ExercicioComparacaoConta_14_10_8 {

	public static void main(String[] args) {

		// declarando variaveis do tipo ContaCorrente
		ContaCorrente conta1 = new ContaCorrente();
		ContaPoupanca conta2 = new ContaPoupanca();

		// definindo atributos da conta
		conta1.setNumero(123);
		conta2.setNumero(123);

		//verifica se conta1 tem os mesmos valores que conta2
		System.out.println(conta1.equals(conta2));

	}

}
