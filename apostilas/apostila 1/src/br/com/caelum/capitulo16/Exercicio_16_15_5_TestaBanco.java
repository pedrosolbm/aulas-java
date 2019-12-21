package br.com.caelum.capitulo16;

public class Exercicio_16_15_5_TestaBanco {
	
	public static void main(String[] args) {

		//declanrando um objeto do tipo ContaCorrente
		Conta cc1 = new ContaCorrente();
		// inserindo saldo na conta corrente
		cc1.deposita(1000);
		
		//declanrando um objeto do tipo ContaPoupança
		Conta cp1 = new ContaPoupanca();
		// inserindo saldo na conta poupança
		cp1.deposita(3000);
		
		//declarando um objeto tipo Exercicio_16_15_5_Banco
		Exercicio_16_15_5_Banco contas = new Exercicio_16_15_5_Banco();
		
		//adicionando a conta corrente no arraylist contas
		contas.adiciona(cc1);
		//adicionando a conta poupança no arraylist contas
		contas.adiciona(cp1);
		
		// retorna a conta na primeira posição da lista
		System.out.println(contas.pega(0));
		
		//verifica o quantas contas tem na lista e retorna a mensagem com o numero de contas
		System.out.println("Total de contas: " + contas.pegaQuantidadeDeContas());
		
	}
}
