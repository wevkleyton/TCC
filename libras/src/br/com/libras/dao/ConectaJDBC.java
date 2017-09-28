package br.com.libras.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectaJDBC {
	
	
	public static ResultSet Conecta(String query) {
		ResultSet result = null;
		try {
			String url = "jdbc:postgresql://localhost:5432/libras";  
			String usuario = "postgres";  
			String senha = "123456";  
			
			Class.forName("org.postgresql.Driver");
			
			Connection con;
			con = DriverManager.getConnection(url, usuario, senha);
			Statement statement = con.createStatement();
			
			result = statement.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
  		
	}
}
