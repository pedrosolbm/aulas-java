package br.com.caelum.capitulo05;
//declaração de classe

public class Data {
	
	// declaração de variáveis
	int dia;
	int mes;
	int ano;

	// metodo da classe
	String formatada() {
		// vai retornar uma string no formato "dia/mes/ano"
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
