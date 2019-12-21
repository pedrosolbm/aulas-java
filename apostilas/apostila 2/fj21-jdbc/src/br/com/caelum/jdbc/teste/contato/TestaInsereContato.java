package br.com.caelum.jdbc.teste.contato;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsereContato {
	
	public static void main(String[] args){
				
		// cria um objeto do tipo Contato
		Contato contato = new Contato();
		
		// definindo os atributos do contato
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		// cria um novo objeto de conexão
		ContatoDao dao = new ContatoDao();
		
		// grava um contato novo no banco 		
		dao.adiciona(contato);
		
		// imprime a mensagem de sucesso
		System.out.println("Contato gravado com sucesso");
	}
}
