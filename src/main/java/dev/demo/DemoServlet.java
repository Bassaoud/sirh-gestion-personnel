package dev.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoServlet extends HttpServlet {

	// GET /demo
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session = req.getSession();
		session.setAttribute("visiter-demo", true);
		
		
		
		// Est-ce qu'il y a un cookie
		Cookie[] cookies = req.getCookies();
		
		
		// Créer Cookie
		
		Cookie cookie = new Cookie("formation", "javaee");
		
		resp.addCookie(cookie);		
		
		String nom = req.getParameter("nom");
		
		if(nom == null) {
			String dernierNom = (String) session.getAttribute("dernierNom");
			resp.getWriter().write("dernierNom=" + dernierNom);
		} else {
			session.setAttribute("dernierNom", nom);
		}
		
		if (nom == null || "".equals(nom.trim())) {
			
			resp.setContentType("text/html");
			
			resp.setStatus(400);
			resp.getWriter().write("Un nom est attendu");
			
		} else {
			// écriture dans le corps de la réponse
			resp.setStatus(200);
			resp.getWriter().write("Ok le nom est " + nom);
		}

		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("Ok post reçu");
	}
	
}
