package br.com.caelum.capitulo05;

public class TestaDesafioFibonacci {

	public static void main(String[] args) {
		DesafioFibonacci_5_7 fibonacci = new DesafioFibonacci_5_7();
		
		int[] array = fibonacci.calculaFibonacci(6);
		
		for (int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + ",");
		}
	}

}
