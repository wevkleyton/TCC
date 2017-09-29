package br.com.libras.bo;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileLockInterruptionException;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;

import br.com.libras.dao.ConectaJDBC;

public class BasicBOImpl {
    

	public void updateImagem() {
		
		
		try {
			
			JFileChooser jFileChooser = new JFileChooser();
			jFileChooser.setFileSelectionMode(jFileChooser.FILES_ONLY);
			int retorno = jFileChooser.showOpenDialog(null);	
			File file = jFileChooser.getSelectedFile();
			
			byte[] imagem = new byte[(int) file.length()];
			System.out.println("lendo imagem" + imagem.length + "bytes...");
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
			dataInputStream.readFully(imagem);
			dataInputStream.close();
			ConectaJDBC.Conecta("insert into imagem values (1,)");
			
			

			
//			System.out.println(file.getAbsolutePath());
//			update mytable set avatarImg = pg_read_file('/Users/myUser/profile.png')::bytea where userid=5;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		BasicBOImpl basicBOImpl = new BasicBOImpl();
		basicBOImpl.updateImagem();
	}

}
