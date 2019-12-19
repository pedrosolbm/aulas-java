package br.com.caelum.capitulo05;

public class Empresa {
	String nome;
	Funcionario[] empregados;
	String cnpj;
	
	void adiciona(Funcionario f) {
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
			System.out.println("Realocando novo funcionário: " + f.nome);
			Funcionario[] arrayMaior = new Funcionario[this.empregados.length + 1];
			for (int i = 0; i < this.empregados.length; i++) {
				arrayMaior[i] = empregados[i];
			}
			arrayMaior[this.empregados.length] = f;
			empregados = arrayMaior;
		}
	}
	
	void mostraEmpregados() {
		for (int i = 0; i < empregados.length; i++) {
			empregados[i].mostra();
		}
	}
	
	boolean contem(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] == f) {
				System.out.println(f.nome + " faz parte da empresa " + this.nome);
				return true;
			} 
		}
		System.out.println(f.nome+ " não faz parte da empresa " + this.nome);
		return false;
	}
}
