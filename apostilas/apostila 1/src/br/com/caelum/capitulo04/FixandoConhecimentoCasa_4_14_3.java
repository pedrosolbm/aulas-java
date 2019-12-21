package br.com.caelum.capitulo04;

public class FixandoConhecimentoCasa_4_14_3 {

	// declarando variaveis
	String cor;
	
	//criando 3 objetos do tipo FixandoConhecimentoPorta_4_14_2
	FixandoConhecimentoPorta_4_14_2 porta1;
	FixandoConhecimentoPorta_4_14_2 porta2;
	FixandoConhecimentoPorta_4_14_2 porta3;

	//declarando metodo de pintura
	void pinta(String s) {
		this.cor = s;
	}
	// verifica quantas portas estão abertas
	int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;
		if (porta1.aberta == true && porta2.aberta == true && porta3.aberta == true) {
			return portasAbertas = 3;
		} else if ((porta1.aberta == true && porta2.aberta == true && porta3.aberta == false) || (porta1.aberta == true && porta2.aberta == false && porta3.aberta == true) || (porta1.aberta == false && porta2.aberta == true && porta3.aberta == true)) {
			return portasAbertas = 2;
		} else if ((porta1.aberta == true && porta2.aberta == false && porta3.aberta == false) || (porta1.aberta == false && porta2.aberta == true && porta3.aberta == false) || (porta1.aberta == false && porta2.aberta == false && porta3.aberta == true)) {
			return portasAbertas = 1;
		}
		else {
			return portasAbertas;
		}
	}
}
