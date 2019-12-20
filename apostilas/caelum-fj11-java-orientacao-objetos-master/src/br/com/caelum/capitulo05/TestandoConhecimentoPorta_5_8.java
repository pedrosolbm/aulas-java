package br.com.caelum.capitulo05;

// declarando uma classe
public class TestandoConhecimentoPorta_5_8 {

	// declarando variaveis da classe
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	// declarando metodos
	void abre() {
		this.aberta = true;
	}

	void fecha() {
		this.aberta = false;
	}

	// pinta a cor da porta passada pelo metodo
	void pinta(String s) {
		this.cor = s;
		System.out.println("A cor da porta: " + this.cor);
	}

	// verifica se a porta está aberta
	boolean estaAberta() {
		if (this.aberta == true) {
			System.out.println("aberta");
			return true;
		} else {
			System.out.println("fechada");
			return false;
		}
	}
}
