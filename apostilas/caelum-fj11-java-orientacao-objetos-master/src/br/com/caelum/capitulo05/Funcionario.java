package br.com.caelum.capitulo05;

import br.com.caelum.capitulo05.Data;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;
	
	void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data da entrada: " + this.dataEntrada.formatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Salário atual: " + this.salario);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
	}
}
