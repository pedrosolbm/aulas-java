package br.com.caelum.capitulo06;

public class TestaDesafioFabricaDeCarros {

	public static void main(String[] args) {

		// decalrando um objeto do tipi DesafioFabricaDeCarro_6_9_2 recebendo uma
		// instancia
		DesafioFabricaDeCarro_6_9_2 fabricaDeCarro = DesafioFabricaDeCarro_6_9_2.getInstancia();

		// imprime a mensagem contida no metodo
		System.out.println(fabricaDeCarro.venderCarroFiat());
		System.out.println(fabricaDeCarro.venderCarroFiat());
		System.out.println(fabricaDeCarro.venderCarroVolks());

		System.out.println(fabricaDeCarro.gerarRelatorio());
	}

}
