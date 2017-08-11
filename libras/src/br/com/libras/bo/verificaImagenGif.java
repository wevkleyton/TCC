package br.com.libras.bo;

import java.io.File;

import javax.swing.JFileChooser;

public class verificaImagenGif {

	public File verificaImagen(){
		File file = null;
		JFileChooser jFileChooser = new JFileChooser();
		int result = jFileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION){
			file = jFileChooser.getSelectedFile();
			System.out.println(file.getAbsolutePath());
		}
		return  file;
	}

	public static void main (String Args[]){


	}
}
