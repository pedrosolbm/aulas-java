package br.com.caelum.capitulo06;

public class TestaEmpresa {

	public static void main(String[] args) {

		// declarando um objeto do tipo empresa com dois funcionarios
		Empresa empresa = new Empresa(2);

		// definindo os atributos da empresa
		empresa.setNome("PROEG");
		empresa.setCnpj("123654");

		// declarando um objeto do tipo funcionário
		Funcionario f1 = new Funcionario();

		// declarando um objeto do tipo data
		Data d1 = new Data(5, 5, 2012);

		// definindo atributos do funcionario
		f1.setNome("Diego");
		f1.setDepartamento("COTIC");
		f1.setDataEntrada(d1);
		f1.setRg("111111");
		f1.setSalario(2000);

		// adicionando um funcionário a empresa
		empresa.adiciona(f1);

		// declarando um objeto do tipo funcionário
		Funcionario f2 = new Funcionario();

		// declarando um objeto do tipo data
		Data d2 = new Data(1, 11, 2016);

		// definindo atributos do funcionario
		f2.setNome("Fabian");
		f2.setDepartamento("COTIC");
		f2.setDataEntrada(d2);
		f2.setRg("222222");
		f2.setSalario(2000);

		// adicionando um funcionário a empresa
		empresa.adiciona(f2);

		// declarando um objeto do tipo funcionário
		Funcionario f3 = new Funcionario();

		// declarando um objeto do tipo data
		Data d3 = new Data(31, 2, 2017);

		// definindo atributos do funcionario
		f3.setNome("Juan");
		f3.setDepartamento("COTIC");
		f3.setDataEntrada(d3);
		f3.setRg("222222");
		f3.setSalario(2000);

		// adicionando um funcionário a empresa
		empresa.adiciona(f3);

		// mostra os empregados da empresa
		empresa.mostraEmpregados();
	}

}
