package br.com.caelum.capitulo04;

// declarando a classe Funcionario
public class Funcionario {
	// declarando variaveis
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;
	
	// metodos da classe

	// soma um valor ao salário do funcionario
	void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	// calcula o salario anual do funcionario
	double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	// mostra informações do funcionario
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Depertamento: " + this.departamento);
		System.out.println("Data da entrada: " + this.dataEntrada.formatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Salario atual: " + this.salario);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
	}
}
