package app;
import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio15{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);//Declara o scanner para ser utilizado na leitura de informação do teclado

		try {//começa a executar o codigo verificando se haverá erros

			System.out.println("Informe seu salario: ");//exibe a mensagem na tela e recebe o valor
		double salario = scan.nextDouble();
		
		System.out.println("\nInforme seu cargo: ");//exibe a mensagem na tela e recebe o valor
		String cargo = scan.next();

		if (cargo.equals("Diretoria")) {//lógica para calculo do emprestimo da Diretoria
			double emprestimo = (salario * 30)/100;
			System.out.println("\nO maximo de emprestimo que voce pode receber de emprestimo e: R$ " + emprestimo);//exibe a mensagem na tela e recebe o valor
		}

		if (cargo.equals("Gerencia")) {//lógica para calculo do emprestimo da Gerencia
			double emprestimo = (salario * 25)/100;
			System.out.println("\nO maximo de emprestimo que voce pode receber de emprestimo e: R$ " + emprestimo);//exibe a mensagem na tela e recebe o valor
		}

		if (cargo.equals("Operacional")) {//lógica para calculo do emprestimo da Operacional
			double emprestimo = (salario * 20)/100;
			System.out.println("\nO maximo de emprestimo que voce pode receber de emprestimo e: R$ " + emprestimo);//exibe a mensagem na tela e recebe o valor
		}

		} catch (Exception e) {//se houver erro, vai informar a mensagem abaixo para o usuario

            System.out.println("Parametro Invalido!");//exibe a mensagem na tela
		}
	}
}
