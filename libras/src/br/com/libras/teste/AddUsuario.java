package br.com.libras.teste;

import br.com.libras.bean.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddUsuario {	

    public static void main(String[] args) {


        Usuario usuario = new Usuario();

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("libras");
        EntityManager entityManager = factory.createEntityManager();


        usuario.setNome("wev kleyton");
        usuario.setSenha("123456");
        
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}
