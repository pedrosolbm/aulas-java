package br.com.caelum.capitulo06;

import br.com.caelum.capitulo06.Data;

//declarando a classe Funcionário
public class Funcionario {

	//declarando variáveis
	private int identificador;
	private static int contadorDeFuncionarios;
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	
	//construtor vazio
	public Funcionario() {
		this.identificador = ++Funcionario.contadorDeFuncionarios;
	}
	
	// construtor cheio
	public Funcionario(String nome) {
		this.nome = nome;
		this.identificador = ++Funcionario.contadorDeFuncionarios;
	}
	
	//gets e sets
	public int getIdentificador() {
		return identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	//adiciona um valor de aumento no salário do funcionário
	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	//calcula o ganho do funcionario
	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	//mostra informações do funcionário
	public void mostra() {
		System.out.println("Identificador: " + this.identificador);
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		if (this.dataEntrada.validaData() == true) {
			System.out.println("Data da entrada: " + this.dataEntrada.formatada());
		} else
			System.out.println("Atencao: A Data de Entrada " + this.dataEntrada.formatada() +  " invalida!");
		System.out.println("RG: " + this.rg);
		System.out.println("Salario atual: " + this.salario);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
		System.out.println("##############################");
	}
}

