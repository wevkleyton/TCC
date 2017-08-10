package br.com.libras.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class ConectaDB {

    public ConectaDB() {
            private static final Logger LOG = Logger.getLogger(null);
        try {
            String drive = "org.postgresql.Driver";
            String user = "";
            String password = "";
            String url = "jdbc:postgresql://localhost:5432/libras";
            
            Class.forName(url);
            Connection con = DriverManager.getConnection(url, user, password);
            LOG.warning("Conexão realizada com SUCESSO!");


        } catch (Exception e) {
            // TODO: handle exception
        }
    }


}
