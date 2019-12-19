package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio_16_6_7_e_8 {

	public static void main(String[] args) {
		List<ContaPoupanca> contas = new ArrayList<>();
		Random numeroAleatorio = new Random();
		
		ContaPoupanca c1 = new ContaPoupanca(); 
		c1.setNumero(numeroAleatorio.nextInt(100));
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(numeroAleatorio.nextInt(100));
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(numeroAleatorio.nextInt(100));
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getNumero());
		}


	}

}
