package br.com.caelum.capitulo04;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		
		data.dia = 23;
		data.mes = 01;
		data.ano = 1987;
		
		f1.nome = "Diego";
		f1.salario = 1000;
		f1.dataEntrada = data;
		f1.recebeAumento(500);
		
		f1.mostra();
		
//		Funcionario f2 = f1;
//		
//		f2.nome = "Diego";
//		f2.salario = 1000;
//		
//		if (f1 == f2) {
//			System.out.println("Iguais");
//		} else {
//			System.out.println("Diferentes");
//		}
//		
	}

}
