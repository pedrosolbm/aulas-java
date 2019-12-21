package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

// classe RemoveContatoLogic herda metodos da Interface Logica
public class RemoveContatoLogic implements Logica{

	// sobreescrevendo o metodo herdado
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// recebe o id da requisição
		long id = Long.parseLong(request.getParameter("id"));
		
		// cria um novo contato
		Contato contato = new Contato();
		
		// define o Id recebido da requisição como id do contato
		contato.setId(id);
		
		// gera uma nova connexão
		Connection connection = (Connection)request.getAttribute("conexao");
		
		// gera um data access object 
		ContatoDao dao = new ContatoDao(connection);
		
		// chama o metodo de exclusão para excluir o contato
		dao.exclui(contato);
		
		// mensagem de exclusão
		System.out.println("Excluindo contato");
		
		// retorna a string de listagem
		return "mvc?logica=ListaContatosLogic";
	}

}
