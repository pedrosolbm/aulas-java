package br.com.caelum.capitulo16;

public class Exercicio_16_15_6_TestaBanco {

	public static void main(String[] args) {

		// declarando um objeto do tipo ContaCorrente
		Conta cc1 = new ContaCorrente();
		// definindo atributo nome da contaCorrente
		cc1.setCliente("diego");
		// adicionando saldo na conta
		cc1.deposita(100);

		// declarando um objeto do tipo ContaPoupança
		Conta cp1 = new ContaPoupanca();
		// definindo atributo nome da contaCorrente
		cp1.setCliente("paula");
		// adicionando saldo na conta
		cp1.deposita(300);

		// declarando um objeto do tipo Exercicio_16_15_6_Banco
		Exercicio_16_15_6_Banco contas = new Exercicio_16_15_6_Banco();

		// adicionando a conta corrente no objeto Contas
		contas.adiciona(cc1);
		// adicionando a conta poupança no objeto Contas
		contas.adiciona(cp1);

		// busca o nome paula e imprime os atributos do objeto
		System.out.println(contas.buscaPorCliente("paula"));

	}

}
