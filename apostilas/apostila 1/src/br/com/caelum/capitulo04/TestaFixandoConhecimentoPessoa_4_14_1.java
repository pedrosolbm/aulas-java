package br.com.caelum.capitulo04;

public class TestaFixandoConhecimentoPessoa_4_14_1 {

	public static void main(String[] args) {

		// declarando objeto do tipo FixandoConhecimentoPessoa_4_14_1
		FixandoConhecimentoPessoa_4_14_1 pessoa = new FixandoConhecimentoPessoa_4_14_1();
		
		//definindo atributos do objeto
		pessoa.nome = "Diego";
		pessoa.idade = 30;
		
		//chamando um metodo do objeto
		pessoa.fazAniversario();
		
		//imprmindo atributos do metodo
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.idade);
	}

}
