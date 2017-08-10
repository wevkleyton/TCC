package br.com.libras.utils;

import javax.swing.JOptionPane;

public class logApp {
    public static void messagem(String msg) {
     
     if (msg == null){
          System.out.println("A menssagem não pode ser nula!!");
     }else if (msg.isEmpty()){
          System.out.println("A menssagem não deve ser vazia!!");
     }
     JOptionPane.showMessageDialog(null, msg);
     System.out.println("A menssagem foi enviada com sucesso!!");
    }
}
