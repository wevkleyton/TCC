package br.com.libras.dao;

import java.io.ByteArrayOutputStream;
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
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import org.hibernate.mapping.Array;

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
	 
	        InputStream is, is2;
	        is = new FileInputStream( file1 );
	        byte[] bytes = new byte[(int)file1.length() ];
	        int offset = 0;
	        int numRead = 0;
	        while (offset < bytes.length
	               && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
	            offset += numRead;
	        }
	 
	        is2 = new FileInputStream( file2 );
	        byte[] bytes2 = new byte[(int)file2.length() ];
	        int offset2 = 0;
	        int numRead2 = 0;
	        while (offset2 < bytes2.length
	               && (numRead2=is2.read(bytes2, offset2, bytes2.length-offset2)) >= 0) {
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
	
	public List<ImageIcon> getFile( String descricao ) throws SQLException, IOException{
		  ImageIcon icon = null, video = null;
		  
	    Connection c = ConectaJDBC.getConnection();
	    File f = null;
	    List<ImageIcon> listIcon = new ArrayList<ImageIcon>();
	    try {
	        PreparedStatement ps = c.prepareStatement("SELECT descricao, imagem, video FROM imagens WHERE descricao = ?");
	        ps.setString(1, descricao);
	        ResultSet rs = ps.executeQuery();
	        if ( rs.next() ){
	            byte [] bytes = rs.getBytes("imagem");
	            byte [] bytes2 = rs.getBytes("video");
	 
	            icon = new ImageIcon(bytes);
	            video = new ImageIcon(bytes2);
	            listIcon.add(icon);
	            listIcon.add(video);
	        }
	        rs.close();
	        ps.close();
	        c.close();
	        return listIcon;
	} catch (SQLException ex) {
	ex.printStackTrace();
	}
	return null;
	}
	
	public static void main(String[] args) throws SQLException, IOException {
		ImagemDAO imagem = new ImagemDAO();
		
		imagem.getFile("acai");
	}
}
