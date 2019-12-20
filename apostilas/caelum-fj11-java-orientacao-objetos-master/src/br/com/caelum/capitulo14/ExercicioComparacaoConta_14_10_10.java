package br.com.caelum.capitulo14;

import br.com.caelum.capitulo11.ContaCorrente;

public class ExercicioComparacaoConta_14_10_10 {

	public static void main(String[] args) {
		// declarando variaveis do tipo ContaCorrente
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		
		//definindo atributos de conta 1
		conta1.setNumero(123);
		conta1.setCliente("Diego");
		
		//definindo atributos de conta 2
		conta2.setNumero(123);
		conta2.setCliente("Diego");
		
		//verifica se conta1 tem os mesmos valores que conta2
		System.out.println(conta1.equals(conta2));
	}

}
