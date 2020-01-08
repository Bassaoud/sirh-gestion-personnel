package dev.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// /a -> ServletA -> /b -> ServletB -> réponse
public class ServletA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Forward
		
		req.setAttribute("depuisServletA", true);
		
		// déléguer le traitement à la servlet ServletB
		req.getRequestDispatcher("/b").forward(req, resp);
		
	}
	
	

}
