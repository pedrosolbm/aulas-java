package br.com.caelum.capitulo05;

public class TestaDesafioFibonacci {

	public static void main(String[] args) {

		//decalrando um objeto do tipo DesafioFibonacci_5_7
		DesafioFibonacci_5_7 fibonacci = new DesafioFibonacci_5_7();
		
		// declarando um array de inteiros para receber os numeros de fibonacci até a 6 posição
		int[] array = fibonacci.calculaFibonacci(6);
		
		//conta de 0 até o tamnho do array
		for (int i = 0; i < array.length ; i++) {
			//imprime o valor do vetor na posição i separado por virgula
			System.out.print(array[i] + ",");
		}
	}

}
