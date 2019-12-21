package br.com.caelum.capitulo11;

public class TestaDeposita {

	public static void main(String[] args) {

		// criando um objeto do tipo ContaPoupança
		ContaPoupanca cp = new ContaPoupanca();

		// tenta realizar a operação dentro do escopo Try{}
		try {
			cp.deposita(-1000);
		}
		// caso não consiga, pega o erro
		catch (ValorInvalidoException e) {
			// imprime o erro
			System.out.println(e.getMessage());
		}
	}

}
