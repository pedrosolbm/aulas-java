package br.com.caelum.capitulo05;

public class TestandoConhecimentoCasa_5_8 {
	String cor;
	int totalDePortas;
	TestandoConhecimentoPorta_5_8[] portas;
	
	void pinta(String s) {
		this.cor = s;
	}
	
	int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;
		for (int i = 0; i < portas.length; i++) {
			if (portas[i].aberta == true) {
				portasAbertas += 1;
			}
		}
		return portasAbertas;
	}
	
	void adicionaPorta(TestandoConhecimentoPorta_5_8 p) {
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] == null) {
				portas[i] = p;
				break;
			}
		}
	}
	
	int totalDePortas() {
		return portas.length;
	}
}
