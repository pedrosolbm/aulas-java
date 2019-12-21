package br.com.caelum.capitulo14;

import br.com.caelum.capitulo11.Conta;
import br.com.caelum.capitulo11.ContaCorrente;

public class TestaExercicioGuardadorDeObjetos_14_10_11 {

	public static void main(String[] args) {
		// Declarando  um objeto do tipo ExercicioGuardadorDeObjetos_14_10_11
		ExercicioGuardadorDeObjetos_14_10_11 guardador = new ExercicioGuardadorDeObjetos_14_10_11();
		
		// criando um objeto do tipo ContaCorrente
		ContaCorrente cc = new ContaCorrente();
		//adicionando saldo na conta
		cc.deposita(100);
		//adicionando a conta no objeto guardador
		guardador.adicionaObjeto(cc);
		

		//declarando um objeto do tipo object que vai receber o objeto 0 do guardador
		Object object = guardador.pegaObjeto(0);
		
		// declarando um objeto conta
		Conta contaResgatada = (Conta) object; 
		
		//imprime o saldo da conta resgatada
		System.out.println(contaResgatada.getSaldo());
		
		//Autoboxing
		Object obj = 123;
		guardador.adicionaObjeto(obj);
		
		System.out.println(guardador.pegaObjeto(1));
	}

}
