package br.com.caelum.capitulo05;

//declarando classe empresa
public class Empresa {

	// definindo variaveis
	String nome;
	Funcionario[] empregados;
	String cnpj;

	// definindo metodos

	// adiciona um funcionario ao vetor da empresa
	void adiciona(Funcionario f) {
		// variavel para verificação
		boolean arrayCheio = true;

		// de 0 até a ultima posição do vetor
		for (int i = 0; i < empregados.length; i++) {
			// se o valor da informação na posição i for nulo
			if (empregados[i] == null) {
				// a posição i recebe um funcionario
				empregados[i] = f;
				// define a verificação de cheio como falso
				arrayCheio = false;
				// para a execução do metodo
				break;
			}
			// se (tamanho do vetor de empregados - 1) for diferente de nulo
			if (empregados[empregados.length - 1] != null) {
				// imprime uma mensagem
				System.out.println("Todas as vagas foram preenchidas!");
				// para a execução do metodo
				break;
			}
		}
		// se o arrayCheio for true
		if (arrayCheio) {
			// imprime a mensagem
			System.out.println("Realocando novo funcionorio: " + f.nome);

			// cria um novo vetor do tipo Funcionario com a quantidade de empregados +1
			Funcionario[] arrayMaior = new Funcionario[this.empregados.length + 1];

			// conta de 0 até o tamanho do vetor de empregados
			for (int i = 0; i < this.empregados.length; i++) {
				// atribui o funcionario do vetor original ao array maior
				arrayMaior[i] = empregados[i];
			}
			// a ultima posição do vetor Maior recebe o funcionario que não coube no vetor
			// original
			arrayMaior[this.empregados.length] = f;
			// empregados recebe o novo array
			empregados = arrayMaior;
		}
	}

	// metodo para monstrar os funcionarios
	void mostraEmpregados() {
		// conta de 0 até o ultimo empregado
		for (int i = 0; i < empregados.length; i++) {
			// chama um metodo do objeto funcionario
			empregados[i].mostra();
		}
	}

	// verifica se funcionario x faz parte da empresa
	boolean contem(Funcionario f) {
		// conta de 0 até o ultimo empregado
		for (int i = 0; i < empregados.length; i++) {
			// verifica se o emrpegado no vetor é o mesmo passado no método
			if (empregados[i] == f) {
				// caso seja, imprime uma mensagem
				System.out.println(f.nome + " faz parte da empresa " + this.nome);
				// sai da função retornando true
				return true;
			}
		}
		// se não encontrar o funcionario, imprime a mensagem
		System.out.println(f.nome + " n�o faz parte da empresa " + this.nome);
		// sai da função retornando false
		return false;
	}
}
