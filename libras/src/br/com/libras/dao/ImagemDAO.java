package br.com.libras.dao;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;

/**
 * 
 * @author wev
 * 
 * Site de referencia 
 * http://www.guj.com.br/t/inserir-recupera-imagem-postgres-resolvido/56230/7
 *
 */
public class ImagemDAO {

	@SuppressWarnings("resource")
	public boolean insertFile( File file1 ,File file2, String nome) throws SQLException{
		
	    Connection c = ConectaJDBC.getConnection();
	    try {

	        PreparedStatement ps = c.prepareStatement("INSERT INTO imagens( id, descricao, imagem, video) VALUES ( nextval('img_id_seq'), ?, ? , ?)");
	 
	        InputStream is;
	        is = new FileInputStream( file1 );
	        byte[] bytes = new byte[(int)file1.length() ];
	        int offset = 0;
	        int numRead = 0;
	        while (offset < bytes.length
	               && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
	            offset += numRead;
	        }
	 
	        byte[] bytes2 = new byte[(int)file2.length() ];
	        int offset2 = 0;
	        int numRead2 = 0;
	        while (offset2 < bytes2.length
	               && (numRead2=is.read(bytes2, offset2, bytes2.length-offset2)) >= 0) {
	            offset2 += numRead2;
	        }
	        
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
	
	public ImageIcon getFile( String descricao ) throws SQLException, IOException{
		  ImageIcon icon = null;
	    Connection c = ConectaJDBC.getConnection();
	    File f = null;
	    try {
	        PreparedStatement ps = c.prepareStatement("SELECT descricao, imagem, video FROM imagens WHERE descricao = ?");
	        ps.setString(1, descricao);
	        ResultSet rs = ps.executeQuery();
	        if ( rs.next() ){
	            byte [] bytes = rs.getBytes("imagem");
	            String nome = rs.getString("descricao");
	            byte [] bytes2 = rs.getBytes("video");
	 

	            f = new File( "/tmp/teste.mp4");
	            FileOutputStream fos = new FileOutputStream( f);
	            fos.write( bytes2 );
	            fos.close();
	            
	            icon = new ImageIcon(bytes);
	            
	        }
	        rs.close();
	        ps.close();
	        c.close();
	        return icon;
	} catch (SQLException ex) {
	ex.printStackTrace();
	}
	return null;
	}
	
	public static void main(String[] args) throws SQLException, IOException {
		ImagemDAO imagem = new ImagemDAO();
		
		imagem.getFile("teste2");
	}
}
