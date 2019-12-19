package br.com.caelum.capitulo04;

public class TestaFixandoConhecimentoCasa_4_14_3 {

	public static void main(String[] args) {
		FixandoConhecimentoCasa_4_14_3 casa = new FixandoConhecimentoCasa_4_14_3();
		FixandoConhecimentoPorta_4_14_2 porta1 = new FixandoConhecimentoPorta_4_14_2();
		FixandoConhecimentoPorta_4_14_2 porta2 = new FixandoConhecimentoPorta_4_14_2();
		FixandoConhecimentoPorta_4_14_2 porta3 = new FixandoConhecimentoPorta_4_14_2();
		
		casa.pinta("Branco");
		
		casa.porta1 = porta1;
		casa.porta2 = porta2;
		casa.porta3 = porta3;
		
		casa.porta1.abre();
		casa.porta2.abre();
		casa.porta1.fecha();
		casa.porta2.fecha();
		casa.porta3.abre();
		casa.porta1.abre();
		casa.porta2.abre();
		
		System.out.println("Quantidade de postas abertas na casa: " + casa.quantasPortasEstaoAbertas());
	}

}
