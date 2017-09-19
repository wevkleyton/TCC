//package br.com.libras.dao;
//
//import br.com.libras.bean.Usuario;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class UsuarioDAO {
//    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("usuario");
//    private EntityManager entityManager = factory.createEntityManager();
//
//    public Usuario getUsuario(String nomeUsuario, String senhaUsuario) {
//        try {
//            Usuario usuario = (Usuario) entityManager.createQuery("select nome, senha from libras.usuario where nome =:nome")
//                    .setParameter("nome", nomeUsuario).setParameter("senha", senhaUsuario).getSingleResult();
//            return usuario;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//    public Boolean insertUsuario(Usuario usuario){
//
//        try {
//            entityManager.persist(usuario);
//            return  true;
//        }catch (Exception e){
//            e.printStackTrace();
//            return true;
//        }
//    }
//
//    public Boolean deletaUsuario(Usuario usuario){
//        try {
//            entityManager.remove(usuario);
//            return  true;
//        }catch (Exception e){
//            e.printStackTrace();
//            return  false;
//        }
//    }
//
//}
