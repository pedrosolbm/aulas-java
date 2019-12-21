package br.com.caelum.capitulo03;

public class Desafio_3_14 {

	public static void main(String[] args) {
		// vai contar de  - até 100
		//auxiliar recebe auxiliar + o numero do contador
		// fibonacci recebe auxiliar
		for (int fibonacci = 0, auxiliar = 1; fibonacci <= 100; auxiliar += fibonacci, fibonacci = auxiliar - fibonacci) {
			//imprime o numero de fibonacci e uma virgula
			System.out.print(fibonacci + ",");
		}
	}

}
