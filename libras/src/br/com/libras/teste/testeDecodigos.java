package br.com.libras.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class testeDecodigos {
	
	public void  conecta() {
		
		
		
	}

	public boolean insertFile( File f1 ,File f2, String nome) throws SQLException{
	    Connection c = this.getConnection();//busca uma conexao com o banco
	    try {

	        PreparedStatement ps = c.prepareStatement("INSERT INTO imagens( id, descricao, imagem, video) VALUES ( nextval('img_id_seq'), ?, ? , ?)");
	 
	        //converte o objeto file em array de bytes
	        InputStream is;
	        is = new FileInputStream( f1 );
	        byte[] bytes = new byte[(int)f1.length() ];
	        int offset = 0;
	        int numRead = 0;
	        while (offset < bytes.length
	               && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
	            offset += numRead;
	        }
	 
	        byte[] bytes2 = new byte[(int)f2.length() ];
	        int offset2 = 0;
	        int numRead2 = 0;
	        while (offset2 < bytes2.length
	               && (numRead2=is.read(bytes2, offset2, bytes2.length-offset2)) >= 0) {
	            offset2 += numRead2;
	        }
	        
//	        ps.setString( 1, f.getName() );
	        ps.setString( 1, nome );
	        ps.setBytes( 2, bytes );
	        ps.setBytes( 3, bytes2 );
	        ps.execute();
	        ps.close();
	        c.close();
	        return true;
	 
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }
	    return false;
	}

    private Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
    	String url = "jdbc:postgresql://localhost:5432/libras";  
		String usuario = "postgres";  
		String senha = "123456";
		
		Connection con;
		con = DriverManager.getConnection(url, usuario, senha);
		//Statement statement = con.createStatement();
		
		return con;
	}

	public static void main(String[] args) throws SQLException {
		
		File arquivo1 = new File("/tmp/wev.jpg");
		File arquivo2 = new File("/tmp/maite.jpg");
		testeDecodigos teste = new testeDecodigos();
		teste.insertFile(arquivo1, arquivo2, "eu e filhota");
      
    }
}
