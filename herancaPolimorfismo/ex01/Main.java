package br.com.residencia.bin.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 321, "thalisson", 230.20);
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(321, 123, "Mauro", 8000.85);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo! Digite o valor desejado do saque: ");
		cce.sacar(entrada.nextDouble());
		System.out.println(cce.getSaldo());
		
		System.out.println("Digite o valor que desejado do saque: ");
		cc.sacar(entrada.nextDouble());
		System.out.println(cc.getSaldo());
		
		entrada.close();
		
	}

}
