package br.com.nidal.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException{
		
		try {
			   Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException ex){ }
		
		String server = "localhost";
		String database = "test";
				
		String url = "jdbc:mysql://" + server + "/" + database + "?autoReconnect=true&useSSL=false";
		String user = "root";
		String senha = "root";

		Connection conn = DriverManager.getConnection(url, user, senha);

		return conn;
	}
	
}
