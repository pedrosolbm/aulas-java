package br.com.caelum.capitulo10;

public class TestaTributavel {

	public static void main(String[] args) {

		//declarando um objeto do tipo ContaCorrente
		ContaCorrente cc = new ContaCorrente();
		
		//inserindo um valor no saldo da conta corrente
		cc.deposita(1000);
		
		// imprime o calculo dos tributos utilizando o metodo da conta Corrente
		System.out.println(cc.calculaTributos());
		
		// cria um objeto Tributavel recebendo o objeto ContaCorrente
		Tributavel t = cc;
		
		//imprime o calculu de tributos utilizando o metodo da INTERFACE Tributavel
		System.out.println(t.calculaTributos());
	}

}
