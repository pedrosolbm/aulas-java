package br.com.residencia.bin.ex06;

public class Gerente extends Funcionario {

	String cargo;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		return "Gerente [cargo=" + cargo + ", matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}

	
	
	
}
