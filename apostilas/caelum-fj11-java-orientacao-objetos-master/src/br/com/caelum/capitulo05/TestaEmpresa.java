package br.com.caelum.capitulo05;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();

		empresa.nome = "PROEG";
		empresa.cnpj = "1234/321";
		empresa.empregados = new Funcionario[2];
		
		Funcionario f1 = new Funcionario();
		Data d1 = new Data();
		
		d1.dia = 5;
		d1.mes = 5;
		d1.ano = 2012;
		
		f1.nome = "Diego";
		f1.dataEntrada = d1;
		f1.departamento = "COTIC";
		f1.rg = "1111111";
		f1.salario = 2000;
		
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		Data d2 = new Data();
		
		d2.dia = 5;
		d2.mes = 11;
		d2.ano = 2016;
		
		f2.nome = "Fabian";
		f2.dataEntrada = d2;
		f2.departamento = "COTIC";
		f2.rg = "2222222";
		f2.salario = 2000;
		
		empresa.adiciona(f2);
		
		Funcionario f3 = new Funcionario();
		Data d3 = new Data();
		
		d3.dia = 1;
		d3.mes = 9;
		d3.ano = 2017;
		
		f3.nome = "Juan";
		f3.dataEntrada = d3;
		f3.departamento = "COTIC";
		f3.rg = "333333";
		f3.salario = 1000;
				
		empresa.contem(f1);
		
		empresa.contem(f3);
		
		empresa.adiciona(f3);
		
		
		empresa.mostraEmpregados();
	}

}
