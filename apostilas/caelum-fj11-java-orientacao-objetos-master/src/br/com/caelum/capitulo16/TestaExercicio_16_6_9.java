package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaExercicio_16_6_9 {

	public static void main(String[] args) {
		List<ExercicioContaPoupanca_16_6_9> contas = new ArrayList<>();
		
		ExercicioContaPoupanca_16_6_9 c1 = new ExercicioContaPoupanca_16_6_9();
		c1.setCliente("Diego");
		contas.add(c1);
		
		ExercicioContaPoupanca_16_6_9 c2 = new ExercicioContaPoupanca_16_6_9();
		c2.setCliente("Alan");
		contas.add(c2);
		
		ExercicioContaPoupanca_16_6_9 c3 = new ExercicioContaPoupanca_16_6_9();
		c3.setCliente("Zord");
		contas.add(c3);
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getCliente());
		}

	}

}
