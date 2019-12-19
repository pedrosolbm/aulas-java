package br.com.caelum.capitulo04;

public class TestaFixandoConhecimentoPessoa_4_14_1 {

	public static void main(String[] args) {
		FixandoConhecimentoPessoa_4_14_1 pessoa = new FixandoConhecimentoPessoa_4_14_1();
		
		pessoa.nome = "Diego";
		pessoa.idade = 30;
		
		pessoa.fazAniversario();
		
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.idade);
	}

}
