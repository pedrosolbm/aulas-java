package br.com.caelum.capitulo11;

public class TestaDeposita {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		try {
			cp.deposita(-1000);			
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
