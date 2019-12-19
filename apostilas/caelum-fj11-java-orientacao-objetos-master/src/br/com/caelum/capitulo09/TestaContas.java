package br.com.caelum.capitulo09;

public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
		
		cc.atualiza(0.10);
		cp.atualiza(0.10);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
