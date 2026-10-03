package br.com.eduardo.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String nome = req.getParameter("nome");
		String data = req.getParameter("data");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date novadata = null;
		try {
			novadata = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa1 = new Empresa();
		empresa1.setNome(nome);
		empresa1.setDataAbertura(novadata);
		
		Banco banco = new Banco();
		banco.adicionar(empresa1);
		
		resp.sendRedirect("ListaEmpresas");
		
//		RequestDispatcher disp = req.getRequestDispatcher("/ListaEmpresas");
//		req.setAttribute("nome", empresa1.getNome());
//		disp.forward(req, resp);
	}
}
