package br.com.caelum.capitulo07;

public class TestaBanco {

	public static void main(String[] args) {

		// criando um objeto tipo Banco
		Banco b = new Banco(3);

		// criando objetos tipo ContaCorrente
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		// criando objeto tipo ContaPoupança
		ContaPoupanca cp1 = new ContaPoupanca();

		// utilizando o metodo deposita das classes
		cc1.deposita(1000);
		cc2.deposita(2000);
		cp1.deposita(3000);

		// adicionando as contas ao banco
		b.adiciona(cc1);
		b.adiciona(cc2);
		b.adiciona(cp1);

		// criando um objeto do tipo AtualizadorDeContas
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		// conta de 0 até 3
		for (int i = 0; i < 3; i++) {
			// atualiza o valor da conta na posição i do vetor de contas no banco
			adc.roda(b.pegaConta(i));
		}
		// mostra o valor das contas
		System.out.println(adc.getSaldoTotal());
	}

}
