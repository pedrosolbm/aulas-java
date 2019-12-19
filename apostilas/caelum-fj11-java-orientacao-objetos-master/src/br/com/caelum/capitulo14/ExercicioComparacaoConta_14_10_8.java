package br.com.caelum.capitulo14;

import br.com.caelum.capitulo11.ContaCorrente;
import br.com.caelum.capitulo11.ContaPoupanca;

public class ExercicioComparacaoConta_14_10_8 {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		ContaPoupanca conta2 = new ContaPoupanca();
		
		conta1.setNumero(123);
		conta2.setNumero(123);
		
		System.out.println(conta1.equals(conta2));
		
	}

}
