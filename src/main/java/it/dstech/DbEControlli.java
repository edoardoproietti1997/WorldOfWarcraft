package it.dstech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbEControlli
{
	//ci sono da cambiare tutti i "from" delle query in base ai riferimenti del database
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "zingaro";
	public static void inserisciUtente (Utente utente) throws ClassNotFoundException, SQLException
	{
		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		String query = "INSERT INTO db.tabella (Username, Passworld, Nome, Cognome, Classe) VALUES ('"+utente.getUsername()+"', '"+
		utente.getPassworld()+"','"+utente.getNome()+"','"+utente.getCognome()+"','"+utente.getMail()+"','"+utente.getTipo()+"',);";
		PreparedStatement createStatement = conn.prepareStatement(query);
		ResultSet result = createStatement.executeQuery(query);
	}
	public static boolean controllaUsername (String username) throws ClassNotFoundException, SQLException
	{
		boolean flag = true ;
		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		try
		{
			String query = "select username from db.tabella where username = '"+username+"';";
			PreparedStatement createStatement = conn.prepareStatement(query);
			ResultSet result = createStatement.executeQuery(query);
		}
		catch (SQLException e)
		{
			flag = false;
		}
		return flag;
	}
	public static boolean controllaPassworld (String passworld, String username) throws ClassNotFoundException, SQLException
	{
		boolean flag = true ;
		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		String query = "select passworld from db.tabella where username = '"+username+"';";
		PreparedStatement createStatement = conn.prepareStatement(query);
		ResultSet result = createStatement.executeQuery(query);
		while(result.next())
		{
			if (passworld.equals(result.getObject("passworld")))
			{
				flag = false;
			}
		}
		return flag;
	}
}