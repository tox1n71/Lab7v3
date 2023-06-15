package org.example;

import models.Worker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Configuration configuration = new Configuration().addAnnotatedClass(Worker.class).;

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Worker worker = session.get(Worker.class, 1);
        System.out.println(worker.getName());
        session.getTransaction().commit();
        sessionFactory.close();
    }
//public static void main(String[] args) {
//    System.out.println("uishdjka");
//}
}