package br.com.caelum.capitulo04;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
