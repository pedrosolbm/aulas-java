package br.com.caelum.capitulo06;

public class TestaDesafioFabricaDeCarros {

	public static void main(String[] args) {
		DesafioFabricaDeCarro_6_9_2 fabricaDeCarro = DesafioFabricaDeCarro_6_9_2.getInstancia();
		
		System.out.println(fabricaDeCarro.venderCarroFiat());
		System.out.println(fabricaDeCarro.venderCarroFiat());
		System.out.println(fabricaDeCarro.venderCarroVolks());
		
		System.out.println(fabricaDeCarro.gerarRelatorio());
	}

}
