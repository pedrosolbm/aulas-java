package br.com.caelum.capitulo04;

//declarando classe
public class FixandoConhecimentoPorta_4_14_2 {

	//declarando variaveis da classe
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	//metodos da classe
	void abre() {
		this.aberta = true;
	}
	
	void fecha() {
		this.aberta = false;
	}
	
	// metodo para alterar a cor da porta
	void pinta(String s) {
		this.cor = s;
		System.out.println("A cor da porta: " + this.cor);
	}
	
	// metodo para verificar se a porta está aberta ou nao
	// se for true, está aberto, se for false está fechado
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
