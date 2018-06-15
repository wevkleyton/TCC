package br.com.libras.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class ComparaArquivos {

    public static boolean verifica(String arq1, String arq2) {

        File arquivo1 = new File(arq1);
        File arquivo2 = new File(arq2);
        int byte_arquivo1;
        int byte_arquivo2;

        if (arquivo1.length() == arquivo2.length()) {
            try {
                InputStream isf1 = new FileInputStream(arquivo1);
                InputStream isf2 = new FileInputStream(arquivo2);
                for (long i = 0; i <= arquivo1.length(); i++) {
                    try {
                        byte_arquivo1 = isf1.read();
                        byte_arquivo2 = isf2.read();
                        if (byte_arquivo1 != byte_arquivo2) {
                            System.out.println("Arquivo da central: " + byte_arquivo1);
                            System.out.println("Arquivo da filial: " + byte_arquivo2);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        verifica("/tmp/central","/tmp/filial");
    }


}
