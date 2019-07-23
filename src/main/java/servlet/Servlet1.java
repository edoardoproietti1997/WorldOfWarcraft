package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Account;

public class Servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String scelta = req.getParameter("SCELTA");
		if ("1".equals(scelta)) {
			getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
		} else {
			getServletContext().getRequestDispatcher("/register.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Account account = new Account(null, null, null, null);
	
		
	}
}
