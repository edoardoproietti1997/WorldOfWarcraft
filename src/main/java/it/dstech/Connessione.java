package it.dstech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Connessione extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		boolean flag = true ;
		if ("1".equals(req.getAttribute("signing")))
		{
			do
			{
				//vai alla pagina adibita alla creazione di un nuovo utente
				getServletContext().getRequestDispatcher("/").forward(req, resp);
				String user = req.getParameter("username");
				try
				{
					flag = DbEControlli.controllaUsername(user);
				}
				catch (ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (flag)
				{
					PrintWriter out= resp.getWriter();
					out.println("<h1><username già esistente, per favore scegli un'altro username</b></h1>");
				}
				else 
				{
					Utente utente = new Utente(req.getParameter("username"), req.getParameter("passworld"), req.getParameter("nome"),
					req.getParameter("cognome"), req.getParameter("mail"), req.getParameter("classe"));
					try
					{
						DbEControlli.inserisciUtente(utente);
					}
					catch (ClassNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					catch (SQLException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} while (flag);
			//memo il metodo risponde true se l'utente esiste , quindi in questo caso continua a creare un nuovo utente se esiste
		}
		else 
		{
			//vai alla pagina per l'accesso di un untente registrato che chiamerà il dopost per i controlli
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String username = req.getParameter("username");
		String passworld = req.getParameter("passworld");
		boolean flag = true;
		do
		{
			//fare il controllo fatto precedentemente nel doGet, se la persona non esiste mandare syso di errore
			try
			{
				flag = DbEControlli.controllaUsername(username);
			}
			catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//uso lo stesso metodo precente che appunto controlla se utente c'è o no
			if (flag == false)
			{
				PrintWriter out= resp.getWriter();
				out.println("<h1><username non esistente, creane uno nuovo o inserisci un username già registrato</b></h1>");
			}
		} while (flag == false);
		//ora controllo sulla passworld
		flag = true;
		do
		{
			try 
			{
				flag = DbEControlli.controllaPassworld(passworld, username);
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			if (flag)
			{
				PrintWriter out= resp.getWriter();
				out.println("<h1>passworld non corretta, reinserisci la passworld</b></h1>");
			}
		}while (flag);
		//vai alla tua bacheca 
	}
}