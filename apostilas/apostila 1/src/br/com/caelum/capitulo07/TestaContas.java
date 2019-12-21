package br.com.caelum.capitulo07;

public class TestaContas {

	public static void main(String[] args) {

		// declarando um objeto tipo conta
		Conta c = new Conta();
		// declarando um objeto tipo Conta Corrente
		ContaCorrente cc = new ContaCorrente();
		// declarando um objeto tipo ContaPoupança
		ContaPoupanca cp = new ContaPoupanca();

		// cada conta utiliza seu metodo proprio para depositar dinheiro
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		// cada conta utiliza seu metodo proprio para atualizar o saldo
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		// imprime o valor do saldo nas contas
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
