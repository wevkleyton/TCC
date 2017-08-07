package br.com.libras.bo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicBOImpl {
    

    public static byte[] ExibeImagem(){
        ResultSet resultSet = null;
        File teste = null;
        Connection conn = new Conn
        try {
            File imagen = new File(teste);
            FileInputStream inputStream = new FileInputStream(imagen);
            PreparedStatement pstmt = 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
