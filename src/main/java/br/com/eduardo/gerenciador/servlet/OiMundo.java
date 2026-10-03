package br.com.eduardo.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi")
public class OiMundo extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException   {
		
		PrintWriter out = resp.getWriter();
		String parametros = req.getParameter("nome");
		out.println("<html><body>Ola mundo! o seu nome é " + parametros + " </body></html>");
		
	}
	
}
