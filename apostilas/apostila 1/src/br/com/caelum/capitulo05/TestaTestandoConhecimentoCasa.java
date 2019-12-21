package br.com.caelum.capitulo05;

public class TestaTestandoConhecimentoCasa {

	public static void main(String[] args) {

		// declarando um objeto tipo TestandoConhecimentoCasa_5_8
		TestandoConhecimentoCasa_5_8 casa = new TestandoConhecimentoCasa_5_8();

		// pintando a casa da cor branca
		casa.pinta("Branca");

		// imprime a mensagem com a cor da casa
		System.out.println("A cor da casa: " + casa.cor);

		// define o tamnho do vetor de portas da casa
		casa.portas = new TestandoConhecimentoPorta_5_8[3];

		// conta de 0 até o tamanho do vetor de portas da casa
		for (int i = 0; i < casa.portas.length; i++) {
			// adiciona uma porta no vetor
			casa.adicionaPorta(casa.portas[i]);
		}
		// imprime a mensagem com a quantidade de portas da casa
		System.out.println("O total de portas na casa: " + casa.totalDePortas());

		// criando objetos do tipo TestandoConhecimentoPorta_5_8
		TestandoConhecimentoPorta_5_8 porta1 = new TestandoConhecimentoPorta_5_8();
		TestandoConhecimentoPorta_5_8 porta2 = new TestandoConhecimentoPorta_5_8();
		TestandoConhecimentoPorta_5_8 porta3 = new TestandoConhecimentoPorta_5_8();

		// cada posição do vetor de portas da casa recebe uma porta declara acima
		casa.portas[0] = porta1;
		casa.portas[1] = porta2;
		casa.portas[2] = porta3;

		// chamando metodos do objeto porta para fechar ou abrir as portas da casa
		casa.portas[0].fecha();
		casa.portas[1].abre();
		casa.portas[2].abre();

		// verifica quantas portas estão abertas na casa e imprime uma mensagem
		System.out.println("O total de portas abertas: " + casa.quantasPortasEstaoAbertas());
	}

}
