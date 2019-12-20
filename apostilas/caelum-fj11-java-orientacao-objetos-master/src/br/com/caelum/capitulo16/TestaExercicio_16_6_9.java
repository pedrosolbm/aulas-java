package br.com.caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaExercicio_16_6_9 {

	public static void main(String[] args) {
		// declarando um ArrayList que armazenará objetos ExercicioContaPoupanca_16_6_9
		List<ExercicioContaPoupanca_16_6_9> contas = new ArrayList<>();

		// criando um objeto do tipo ExercicioContaPoupanca_16_6_9
		ExercicioContaPoupanca_16_6_9 c1 = new ExercicioContaPoupanca_16_6_9();

		// definindo o nome do cliente
		c1.setCliente("Diego");

		// adicionando a conta c1 no arrayList contas
		contas.add(c1);

		// criando um objeto do tipo ExercicioContaPoupanca_16_6_9
		ExercicioContaPoupanca_16_6_9 c2 = new ExercicioContaPoupanca_16_6_9();

		// definindo o nome do cliente
		c2.setCliente("Alan");

		// adicionando a conta c2 no arrayList contas
		contas.add(c2);

		// criando um objeto do tipo ExercicioContaPoupanca_16_6_9
		ExercicioContaPoupanca_16_6_9 c3 = new ExercicioContaPoupanca_16_6_9();

		// definindo o nome do cliente
		c3.setCliente("Zord");

		// adicionando a conta c3 no arrayList contas
		contas.add(c3);

		// ordenando o arraList de contas
		Collections.sort(contas);

		// conta de 0 até o tamno do arrayList contas
		for (int i = 0; i < contas.size(); i++) {
			// imprime o nome do cliente associado a conta i dentro da lista
			System.out.println(contas.get(i).getCliente());
		}

	}

}
