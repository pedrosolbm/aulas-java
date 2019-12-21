package br.com.caelum.capitulo05;

public class TestandoConhecimentoCasa_5_8 {

	//Declarando variaveis
	String cor;
	int totalDePortas;

	//decalrando um vetor de portas
	TestandoConhecimentoPorta_5_8[] portas;
	
	void pinta(String s) {
		this.cor = s;
	}
	
	// conta quantas portas estão abertas
	int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;
		for (int i = 0; i < portas.length; i++) {
			if (portas[i].aberta == true) {
				portasAbertas += 1;
			}
		}
		return portasAbertas;
	}
	
	//adiciona uma porta ao vetor
	void adicionaPorta(TestandoConhecimentoPorta_5_8 p) {
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] == null) {
				portas[i] = p;
				break;
			}
		}
	}
	//retorna o tamanho do vetor de portas
	int totalDePortas() {
		return portas.length;
	}
}
