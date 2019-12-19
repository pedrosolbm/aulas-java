package br.com.caelum.capitulo16;

public class Exercicio_16_15_6_TestaBanco {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente();
		cc1.setCliente("diego");
		cc1.deposita(100);
		
		Conta cp1 = new ContaPoupanca();
		cp1.setCliente("paula");
		cp1.deposita(300);
		
		Exercicio_16_15_6_Banco contas = new Exercicio_16_15_6_Banco();
		
		contas.adiciona(cc1);
		contas.adiciona(cp1);
		
		System.out.println(contas.buscaPorCliente("paula"));

	}

}
