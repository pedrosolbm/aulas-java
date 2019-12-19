package br.com.caelum.capitulo04;

public class TestaFixandoConhecimentoPorta_4_14_2 {

	public static void main(String[] args) {
		FixandoConhecimentoPorta_4_14_2 porta = new FixandoConhecimentoPorta_4_14_2();
		
		porta.abre();
		
		porta.fecha();
		
		porta.abre();
		
		porta.dimensaoX = 2;
		
		porta.dimensaoY = 3;
		
		porta.dimensaoZ = 4;
		
		porta.pinta("Azul");
		
		porta.estaAberta();
	}

}
