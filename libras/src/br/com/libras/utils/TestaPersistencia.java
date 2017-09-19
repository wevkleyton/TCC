/*
package br.com.libras.utils;

import br.com.libras.bean.Usuario;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.context.internal.ManagedSessionContext;

import javax.persistence.*;

public class TestaPersistencia {
    public static void main(String[] args) {

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libras");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        Usuario usuario = new Usuario();
//        usuario.setNome("wev");
//        usuario.setSenha("py8apo");
//
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        entityTransaction.begin();
//        entityManager.persist(usuario);
//        entityTransaction.commit();
//        entityManager.close();

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSesion;

        try{
            currentSesion = sessionFactory.openSession();
            currentSesion.setFlushMode(FlushMode.MANUAL);

            ManagedSessionContext.bind(currentSesion);
            currentSesion.beginTransaction();
            Usuario usuario = new Usuario();
            usuario.setNome("kleyton");
            usuario.setSenha("987654321");
            currentSesion.save(usuario);
            ManagedSessionContext.unbind(sessionFactory);
            currentSesion.flush();
            currentSesion.getTransaction().commit();
            currentSesion.close();

        }catch (StaleObjectStateException epse){
            throw  epse;
        }catch (Throwable ex){
            ex.printStackTrace();
        }


        try{
            if (sessionFactory.getCurrentSession().getTransaction().isActive()){
                sessionFactory.getCurrentSession().getTransaction().rollback();
            }
        }catch (Throwable ex){
            ex.printStackTrace();
        }finally {
            currentSesion = ManagedSessionContext.unbind(sessionFactory);
            currentSesion.close();
        }
        System.out.println("FINALIZADO!!!");

    }


}
*/
