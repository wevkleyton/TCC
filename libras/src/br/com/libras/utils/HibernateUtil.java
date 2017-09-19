//package br.com.libras.utils;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;
//
//
//public class HibernateUtil {
//
//    public static SessionFactory sessionFactory;
//    public HibernateUtil(){
//
//    }
//
//    public static SessionFactory getSessionFactory(){
//        if(sessionFactory == null){
//         try {
//             AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
//             sessionFactory = annotationConfiguration.configure().buildSessionFactory();
//         }catch (Throwable ex){
//             System.out.println("Erro ao iniciar Hibernate " + ex);
//             throw  new ExceptionInInitializerError(ex);
//         }
//            return  sessionFactory;
//        }else{
//
//            return  sessionFactory;
//        }
//    }
//
//}
