package br.com.libras.dao;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.hibernate.metamodel.domain.Superclass;

/**
 * 
 * @author wev
 * 
 * Site de referencia 
 * http://www.guj.com.br/t/inserir-recupera-imagem-postgres-resolvido/56230/7
 *
 */
public class ImagemDAO {

	public static boolean salvarImagen(String imagem) {
		String query = "insert into imagem (id, descricao, imagem, video) values ()  ";
		try {
			ResultSet result = ConectaJDBC.Conecta(query);
			File imagemFile = new File(imagem);
			byte[] imagemArray = new byte[(int) imagemFile.length()];
			DataInputStream imagemStream = new DataInputStream(new FileInputStream(imagemFile));
			imagemStream.readFully(imagemArray);
			imagemStream.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return true;
	}
	
	private static boolean selectImagem(String descricao) {
		String query = "select imagem from imagem where descricao = '" + descricao + "'";
		
		System.out.println(query);
		try {
			ResultSet  resultado = ConectaJDBC.Conecta(query);
			if(resultado.next()) {
				Blob blob = resultado.getBlob(1);
				ImageIcon icon = new ImageIcon(blob.getBytes(1, (int) blob.length()));
				System.out.println(icon);
				JFrame frame = new JFrame();
				frame.setVisible(true);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		selectImagem("açai");
	}
}
