package dev.demo.mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListePersonneServlet extends HttpServlet {
	
	private PersonneService personneService = new PersonneService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Personne> listerPersonnes = this.personneService.listerPersonnes();
		
		req.setAttribute("listeP", listerPersonnes);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/listePersonnes.jsp").forward(req, resp);
		
		
		
	}
	
	

}
