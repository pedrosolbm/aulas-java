package br.com.caelum.capitulo05;

public class TestaEmpresa {

	public static void main(String[] args) {

		// declarando um objeto do tipo Empresa
		Empresa empresa = new Empresa();

		// definindo atributos de emrpesa
		empresa.nome = "PROEG";
		empresa.cnpj = "1234/321";

		// definindo o vetor de funcionarios da empresa com duas posições
		empresa.empregados = new Funcionario[2];

		// declarando um objeto do tipo Funcionario
		Funcionario f1 = new Funcionario();

		// declarando um objeto do tipo Data
		Data d1 = new Data();

		// declarando atributos de Data
		d1.dia = 5;
		d1.mes = 5;
		d1.ano = 2012;

		// declarando atributos do funcionario
		f1.nome = "Diego";
		f1.dataEntrada = d1;
		f1.departamento = "COTIC";
		f1.rg = "1111111";
		f1.salario = 2000;

		// adicionando um funcionário no vetor da empresa
		empresa.adiciona(f1);

		// declarando um novo funcionário
		Funcionario f2 = new Funcionario();

		// declarando uma nova data
		Data d2 = new Data();

		// definindo valores aos atributos da nova data
		d2.dia = 5;
		d2.mes = 11;
		d2.ano = 2016;

		// definindo valores aos atributos do novo funcionario
		f2.nome = "Fabian";
		f2.dataEntrada = d2;
		f2.departamento = "COTIC";
		f2.rg = "2222222";
		f2.salario = 2000;

		// adicionando o funcionario no vetor da empresa
		empresa.adiciona(f2);

		// declarando um novo funcionario
		Funcionario f3 = new Funcionario();

		// declarando uma nova data
		Data d3 = new Data();

		// atribuindo valores a nova data
		d3.dia = 1;
		d3.mes = 9;
		d3.ano = 2017;

		// atribuindo valores ao novo funcionario
		f3.nome = "Juan";
		f3.dataEntrada = d3;
		f3.departamento = "COTIC";
		f3.rg = "333333";
		f3.salario = 1000;

		// verifica se a empresa contem o funcionario f1
		empresa.contem(f1); // retorna true

		// verifica se a empresa contem o funcionario f3
		empresa.contem(f3); // retorna false

		// adicionando um novo funcionario aos empregados da empresa
		empresa.adiciona(f3);

		// imprime o vetor de empregados da empresa
		empresa.mostraEmpregados();
	}

}
