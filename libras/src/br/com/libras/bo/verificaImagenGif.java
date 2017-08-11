package br.com.libras.bo;

import java.io.File;

import javax.swing.JFileChooser;

public class verificaImagenGif {

	public verificaImagenGif(){
		JFileChooser jFileChooser = new JFileChooser();
		int result = jFileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION){
			File file = jFileChooser.getSelectedFile();
			System.out.println(file.getAbsolutePath());
		}
	}

	public static void main (String Args[]){

	}
}
