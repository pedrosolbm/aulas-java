package app;
import java.util.Scanner;

public class Exercicio15{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Informe seu salario: ");
		double salario = scan.nextDouble();
		
		System.out.println("\nInforme seu cargo: ");
		String cargo = scan.next();

		if (cargo.equals("Diretoria")) {
			double emprestimo = (salario * 30)/100;
			System.out.println("\nO maximo de emprestimo que voce pode receber de emprestimo e: R$ " + emprestimo);
		}

		if (cargo.equals("Gerencia")) {
			double emprestimo = (salario * 25)/100;
			System.out.println("\nO maximo de emprestimo que voce pode receber de emprestimo e: R$ " + emprestimo);
		}

		if (cargo.equals("Operacional")) {
			double emprestimo = (salario * 20)/100;
			System.out.println("\nO maximo de emprestimo que voce pode receber de emprestimo e: R$ " + emprestimo);
		}
	}
}