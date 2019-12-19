package br.com.caelum.capitulo06;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(2);
		
		empresa.setNome("PROEG");
		empresa.setCnpj("123654");
		
		Funcionario f1 = new Funcionario();
		Data d1 = new Data(5,5,2012);
		
		f1.setNome("Diego");
		f1.setDepartamento("COTIC");
		f1.setDataEntrada(d1);
		f1.setRg("111111");
		f1.setSalario(2000);
		
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		Data d2 = new Data(1,11,2016);
		
		f2.setNome("Fabian");
		f2.setDepartamento("COTIC");
		f2.setDataEntrada(d2);
		f2.setRg("222222");
		f2.setSalario(2000);
		
		empresa.adiciona(f2);
		
		Funcionario f3 = new Funcionario();
		Data d3 = new Data(31,2,2017);
		
		f3.setNome("Juan");
		f3.setDepartamento("COTIC");
		f3.setDataEntrada(d3);
		f3.setRg("222222");
		f3.setSalario(2000);
		
		//empresa.contem(f3);
		
		empresa.adiciona(f3);
		
		empresa.mostraEmpregados();
	}

}
