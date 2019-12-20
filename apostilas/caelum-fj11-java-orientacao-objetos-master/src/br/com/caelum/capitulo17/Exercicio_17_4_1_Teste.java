package br.com.caelum.capitulo17;

public class Exercicio_17_4_1_Teste {

	public static void main(String[] args) {

		// declarando um objeto do tipo Exercicio_17_4_1_Programa
		Exercicio_17_4_1_Programa p1 = new Exercicio_17_4_1_Programa();
		// definindo o Id do programa
		p1.setId(1);

		// criando uma nova Thread utilizando o programa p1
		Thread t1 = new Thread(p1);

		// iniciando a thread
		t1.start();

		// declarando um objeto do tipo Exercicio_17_4_1_Programa
		Exercicio_17_4_1_Programa p2 = new Exercicio_17_4_1_Programa();
		// definindo o Id do programa
		p2.setId(2);

		// criando uma nova Thread utilizando o programa 2
		Thread t2 = new Thread(p2);

		// iniciando a thread
		t2.start();
	}

}
