package br.com.caelum.capitulo10;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {

		// declarando um objeto do tipo GerenciadorDeImpostoDeRenda
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		// declarando um objeto do tipo SeguroDeVida
		SeguroDeVida sv = new SeguroDeVida();

		// adicionando o seguro de vida ao gerenciador de imposto de Renda
		gerenciador.adiciona(sv);

		// criando um objeto do tipo ContaCorrente
		ContaCorrente cc = new ContaCorrente();

		// depositando um valor
		cc.deposita(1000);

		// adicionando a conta corrente ao gerenciador de imposto de renda
		gerenciador.adiciona(cc);

		// imprime o valor dotal do gerenciador
		System.out.println(gerenciador.getTotal());

		// imprime o saldo da conta corrente
		System.out.printf("O saldo: %.2f", cc.getSaldo());
	}
}
