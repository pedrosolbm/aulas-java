package br.com.caelum.capitulo14;

import br.com.caelum.capitulo11.ContaCorrente;

public class ExercicioComparacaoConta_14_10_10 {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		
		conta1.setNumero(123);
		conta1.setCliente("Diego");
		
		conta2.setNumero(123);
		conta2.setCliente("Diego");
		
		System.out.println(conta1.equals(conta2));
	}

}
