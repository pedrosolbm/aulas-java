package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// classe OiMundo herda os atributos e metodos de HttpServlet
public class OiMundo  extends HttpServlet {
	
	// sobreescrevendo o metodo herdado
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//declarando o objeto responsável por "escrever" na tela
		PrintWriter out = response.getWriter();
		
		// o escritor insere na pagina as linhas abaixo gerando um codigo html
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Prmeira Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Oi mundo Servlet!</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
