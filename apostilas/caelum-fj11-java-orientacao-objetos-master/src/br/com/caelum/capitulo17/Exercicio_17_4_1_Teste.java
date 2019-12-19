package br.com.caelum.capitulo17;

public class Exercicio_17_4_1_Teste {

	public static void main(String[] args) {
		Exercicio_17_4_1_Programa p1 = new Exercicio_17_4_1_Programa();
		p1.setId(1);
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		Exercicio_17_4_1_Programa p2 = new Exercicio_17_4_1_Programa();
		p2.setId(2);
		
		Thread t2 = new Thread(p2);
		t2.start();
	}

}
