package br.com.libras.dao;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;

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
		String query = "update ";
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
}
