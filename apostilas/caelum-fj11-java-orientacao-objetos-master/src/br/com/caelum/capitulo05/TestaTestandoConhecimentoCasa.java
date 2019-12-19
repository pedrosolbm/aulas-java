package br.com.caelum.capitulo05;

public class TestaTestandoConhecimentoCasa {

	public static void main(String[] args) {
		TestandoConhecimentoCasa_5_8 casa = new TestandoConhecimentoCasa_5_8();
		
		casa.pinta("Branca");
		
		System.out.println("A cor da casa é: " + casa.cor);
		
		casa.portas = new TestandoConhecimentoPorta_5_8[3];
		
		for (int i = 0; i < casa.portas.length; i++) {
			casa.adicionaPorta(casa.portas[i]);
		}
		
		System.out.println("O total de portas na casa é: " + casa.totalDePortas());
		
		TestandoConhecimentoPorta_5_8 porta1 = new TestandoConhecimentoPorta_5_8();
		TestandoConhecimentoPorta_5_8 porta2 = new TestandoConhecimentoPorta_5_8();
		TestandoConhecimentoPorta_5_8 porta3 = new TestandoConhecimentoPorta_5_8();

		casa.portas[0] = porta1;
		casa.portas[1] = porta2;
		casa.portas[2] = porta3;
		
		casa.portas[0].fecha();
		casa.portas[1].abre();
		casa.portas[2].abre();
		
		System.out.println("O total de portas abertas é: " + casa.quantasPortasEstaoAbertas());
	}

}
