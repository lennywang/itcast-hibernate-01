package com.itcast.utils;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static SessionFactory sessionFactory;

    static {
        Configuration configure = new Configuration().configure();
        sessionFactory = configure.buildSessionFactory();
    }

    public static Session openSession(){
        Session session = sessionFactory.openSession();
        return session;
    }

    public static Session getCurrentSession()
    {
        Session session = sessionFactory.getCurrentSession();
        return  session;
    }

    public static void main(String[] args) {
        System.out.println(HibernateUtils.openSession());
    }
}
