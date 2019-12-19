package br.com.caelum.capitulo06;

import br.com.caelum.capitulo06.Data;

public class Funcionario {
	private int identificador;
	private static int contadorDeFuncionarios;
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	
	public Funcionario() {
		this.identificador = ++Funcionario.contadorDeFuncionarios;
	}
	
	public Funcionario(String nome) {
		this.nome = nome;
		this.identificador = ++Funcionario.contadorDeFuncionarios;
	}
	
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

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	public void mostra() {
		System.out.println("Identificador: " + this.identificador);
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		if (this.dataEntrada.validaData() == true) {
			System.out.println("Data da entrada: " + this.dataEntrada.formatada());
		} else
			System.out.println("Atenção: A Data de Entrada " + this.dataEntrada.formatada() +  " é inválida!");
		System.out.println("RG: " + this.rg);
		System.out.println("Salário atual: " + this.salario);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
		System.out.println("##############################");
	}
}

