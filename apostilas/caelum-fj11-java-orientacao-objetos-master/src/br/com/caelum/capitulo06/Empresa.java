package br.com.caelum.capitulo06;

import br.com.caelum.capitulo06.Funcionario;

public class Empresa {
	private String nome;
	private Funcionario[] empregados;
	private String cnpj;
	
	public Empresa(int quantidadeDeFuncionarios) {
		this.empregados = new Funcionario[quantidadeDeFuncionarios];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Funcionario getFuncionario(int posicao) {
		return this.empregados[posicao];
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void adiciona(Funcionario f) {
		boolean arrayCheio = true;
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] == null) {
				empregados[i] = f;
				arrayCheio = false;
				break;
			} if (empregados[empregados.length - 1] != null) {
				System.out.println("Todas as vagas já foram preenchidas!");				
				break;
			}
		}
		if (arrayCheio) {
			System.out.println("Realocando novo funcionário: " + f.getNome() + "\n");
			Funcionario[] arrayMaior = new Funcionario[this.empregados.length + 1];
			for (int i = 0; i < this.empregados.length; i++) {
				arrayMaior[i] = empregados[i];
			}
			arrayMaior[this.empregados.length] = f;
			empregados = arrayMaior;
		}
	}
	
	public void mostraEmpregados() {
		for (int i = 0; i < empregados.length; i++) {
			empregados[i].mostra();
		}
	}
	
	public boolean contem(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] == f) {
				System.out.println(f.getNome() + " faz parte da empresa " + this.nome);
				return true;
			} 
		}
		System.out.println(f.getNome() + " não faz parte da empresa " + this.nome);
		return false;
	}
}
