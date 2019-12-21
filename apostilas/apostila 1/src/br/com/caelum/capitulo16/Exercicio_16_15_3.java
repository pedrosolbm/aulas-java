package br.com.caelum.capitulo16;

import java.util.HashMap;
import java.util.Map;

public class Exercicio_16_15_3 {

	public static void main(String[] args) {

		// declarando um objeto tipo contaCorrente
		Conta c1 = new ContaCorrente();
		// depositando um valor
		c1.deposita(10000);

		// declarando um objeto tipo contaCorrente
		Conta c2 = new ContaCorrente();
		// depositando um valor
		c2.deposita(3000);

		// criando um objeto tipo HasMap que receberá uma String e um objeto Conta
		Map<String, Conta> mapaDeContas = new HashMap<>();

		// adicionando contas no HashMap. passando a String e o objeto Conta
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		// Criando um objeto abstrato Conta que receberá a conta que tiver o nome "diretor"
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		
		// retorna o saldo da conta do diretor
		System.out.println(contaDoDiretor.getSaldo());
	}

}
