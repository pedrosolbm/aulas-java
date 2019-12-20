package br.com.caelum.capitulo17;

// classe Exercicio_17_4_1_Programa herda metodos da INTERFACE Runnable
public class Exercicio_17_4_1_Programa implements Runnable {

	// variaveis da classe
	private int id;

	// metodo get e set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// sobreescrevendo metodo herdado
	@Override
	public void run() {
		// conta de 0 até 999
		for (int i = 0; i < 1000; i++) {
			// imprime o id do programa juntamente com seu valor i
			System.out.println("Programa " + id + " valor: " + i);
		}

	}

}
