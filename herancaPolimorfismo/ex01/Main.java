import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//crianto um objeto do tipo contaCorrente
		ContaCorrente cc = new ContaCorrente(123, 321, "Pedro", 230.20);

		//criando um objeto do tipo ContaCorrenteEspecial
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(321, 123, "Guilherme", 8000.85);
		
		//criando um objeto do tipo Scanner para receber o que for digitado pelo usuário
		Scanner entrada = new Scanner(System.in);
		
		//solicita valor de saque do usuário
		System.out.println("Bem vindo! Digite o valor desejado do saque: ");
		
		//usa o metodo sacar da classe ContaCorrenteEspecial com o valor que foi digitado pelo usuário
		cce.sacar(entrada.nextDouble());

		//usa o metodo getSaldo da classe ContaCorrenteEspecial para mostrar o saldo
		System.out.println(cce.getSaldo());
		
		//usa o metodo sacar da classe ContaCorrente com o valor que foi digitado pelo usuário
		System.out.println("Digite o valor que desejado do saque: ");
		
		//usa o metodo sacar da classe ContaCorrente com o valor que foi digitado pelo usuário
		cc.sacar(entrada.nextDouble());
		
		//usa o metodo getSaldo da classe ContaCorrente para mostrar o saldo
		System.out.println(cc.getSaldo());
		
		//encerra a leitura de dados do scanner
		entrada.close();
		
	}

}
