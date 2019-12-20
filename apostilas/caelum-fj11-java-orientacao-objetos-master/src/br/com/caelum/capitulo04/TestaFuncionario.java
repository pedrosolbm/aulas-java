package br.com.caelum.capitulo04;

public class TestaFuncionario {

	public static void main(String[] args) {
		// declarando um objeto tipo Funcionario
		Funcionario f1 = new Funcionario();
		// declarando um objeto tipo Data
		Data data = new Data();

		// definindo atributos do objeto data
		data.dia = 23;
		data.mes = 01;
		data.ano = 1987;

		// definindo atributos do objeto Funcionario
		f1.nome = "Diego";
		f1.salario = 1000;
		f1.dataEntrada = data;
		// usando um metodo do objeto Funcionario
		f1.recebeAumento(500);

		// usando um metodo do objeto Funcionario para monstrar as informações
		f1.mostra();
	}
}