package br.com.caelum.capitulo07;

public class TestaAtualizadorDeContas {

	public static void main(String[] args) {

		//declarando um objeto tipo Conta
		Conta c = new Conta();
		// criando um objeto do tipo ContaCorrente
		ContaCorrente cc = new ContaCorrente();
		// criando um objeto do tipo ContaPoupança
		ContaPoupanca cp = new ContaPoupanca();
		
		//depositando 1000 reais nas contas
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		//decalrando um objeto tipo AtualizadorDeContas
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		// atualizando o valor de todas as contas
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		//imprime o saldo total das contas
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}

}
