package br.com.libras.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectaJDBC {
	
	
	public static ResultSet Conecta(String query) {
		ResultSet result = null;
		try {
			/*
			String url = "jdbc:postgresql://172.16.98.130:5432/libras";
			String usuario = "dbadmin";
			String senha = "123456";
			*/  
			
//			configuração localhost
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
	
	public static void main(String[] args) {
		try {
			ResultSet result = ConectaJDBC.Conecta("select * from usuario where nome = 'kleyton'");
			while (result.next()) {
				result.getString("nome");
				System.out.println(result.getString("nome"));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
