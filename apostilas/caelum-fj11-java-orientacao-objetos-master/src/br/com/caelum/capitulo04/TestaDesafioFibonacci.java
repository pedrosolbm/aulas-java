package br.com.caelum.capitulo04;

public class TestaDesafioFibonacci {

	public static void main(String[] args) {
		DesafioFibonacci_4_13_1 fibonacci = new DesafioFibonacci_4_13_1();
		//DesafioFibonacci_4_13_3 fibonacci = new DesafioFibonacci_4_13_3();
		
		for (int i = 1; i <= 6; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.print(resultado + ",");
		}
	}

}
