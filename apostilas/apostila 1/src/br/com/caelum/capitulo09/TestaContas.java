package br.com.caelum.capitulo09;

public class TestaContas {

	public static void main(String[] args) {

		// declarando objeto do tipo contaCorrente
		ContaCorrente cc = new ContaCorrente();
		// declarando objeto do tipo contaPoupança
		ContaPoupanca cp = new ContaPoupanca();

		// cada objeto utiliza seu proprio metodo de deposito
		cc.deposita(1000);
		cp.deposita(1000);

		// atualizando o saldo da conta
		cc.atualiza(0.10);
		cp.atualiza(0.10);

		// imprime o saldo das contas
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
