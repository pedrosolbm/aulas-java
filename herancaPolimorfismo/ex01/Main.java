/* 
Crie uma classe para representar uma conta corrente, com métodos para depositar uma quantia,
sacar uma quantia e obter o saldo. Para cada saque será debitada também uma taxa de operação
equivalente à 0,5% do valor sacado. Crie, em seguida, uma subclasse desta classe anterior para
representar uma conta corrente de um cliente especial. Clientes especiais pagam taxas de operação
de apenas 0,1% do valor sacado. Faça testes com as duas classes e verifique seus resultados.
*/
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:13/12/2019
 */

//biblitoeca utilizada para leitura de dados via teclado
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
