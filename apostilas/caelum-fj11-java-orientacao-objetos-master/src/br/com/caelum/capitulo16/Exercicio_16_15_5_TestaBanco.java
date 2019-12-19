package br.com.caelum.capitulo16;

public class Exercicio_16_15_5_TestaBanco {
	
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente();
		cc1.deposita(1000);
		
		Conta cp1 = new ContaPoupanca();
		cp1.deposita(3000);
		
		Exercicio_16_15_5_Banco contas = new Exercicio_16_15_5_Banco();
		
		contas.adiciona(cc1);
		contas.adiciona(cp1);
		
		System.out.println(contas.pega(0));
		
		System.out.println("Total de contas: " + contas.pegaQuantidadeDeContas());
		
	}
}
