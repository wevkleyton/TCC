package br.com.libras.dao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConectaDB {

    final Logger LOG = Logger.getLogger(null);
    Connection con;

    @SuppressWarnings("unused")
	public ConectaDB() {

        try {
            String drive = "org.postgresql.Driver";
            String user = "";
            String password = "";
            String url = "jdbc:postgresql://localhost:5432/libras";
            Class.forName(url);
            con =  DriverManager.getConnection(url, user, password);
            LOG.warning("Conexão realizada com SUCESSO!");


        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public  void Desconecta() throws SQLException {
    int result =  JOptionPane.showConfirmDialog(null,
            "Você Deseja Realmente Fechar a Conexão Com o Banco de Dados?",
            "Fechamento da Conexão com Banco de Dados", JOptionPane.YES_NO_OPTION);
        System.out.println(result == 0 ? true : false );
        con.close();

    }
    @SuppressWarnings("unused")
	private static void salvar(String query){
        System.out.println("Salvando Arquivo");

    }
    private static  void exclir(String query){
        int result = JOptionPane.showConfirmDialog(null,"Exclir Dados" ,
        "Exclusão de Dados", JOptionPane.YES_NO_OPTION);

        if(result == 0){
            System.out.println("teste");
        }

    }

    private  void excluir(){
        System.out.println("Executando um delete no banco");
    }

    private void alterar(){
        System.out.println("alterando arquivo");
    }



}
