package br.com.caelum.capitulo04;

public class TestaFixandoConhecimentoPorta_4_14_2 {

	public static void main(String[] args) {

		//declarando um objeto FixandoConhecimentoPorta_4_14_2
		FixandoConhecimentoPorta_4_14_2 porta = new FixandoConhecimentoPorta_4_14_2();
		
		// chamando metodos do objeto porta
		porta.abre();
		
		porta.fecha();
		
		porta.abre();
		
		// definindo atributos do objeto porta
		porta.dimensaoX = 2;
		
		porta.dimensaoY = 3;
		
		porta.dimensaoZ = 4;
		
		// chamando metodo do objeto utilizando parametro
		porta.pinta("Azul");
		
		// verifica se a porta está aberta
		porta.estaAberta();
	}

}
