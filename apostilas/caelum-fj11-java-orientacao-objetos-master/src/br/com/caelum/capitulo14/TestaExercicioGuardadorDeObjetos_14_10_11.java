package br.com.caelum.capitulo14;

import br.com.caelum.capitulo11.Conta;
import br.com.caelum.capitulo11.ContaCorrente;

public class TestaExercicioGuardadorDeObjetos_14_10_11 {

	public static void main(String[] args) {
		ExercicioGuardadorDeObjetos_14_10_11 guardador = new ExercicioGuardadorDeObjetos_14_10_11();
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		guardador.adicionaObjeto(cc);
		
		Object object = guardador.pegaObjeto(0);
		
		Conta contaResgatada = (Conta) object; 
		
		System.out.println(contaResgatada.getSaldo());
		
		//Autoboxing
		Object obj = 123;
		guardador.adicionaObjeto(obj);
		
		System.out.println(guardador.pegaObjeto(1));
	}

}
