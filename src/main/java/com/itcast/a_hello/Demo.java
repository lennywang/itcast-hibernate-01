package com.itcast.a_hello;


import com.itcast.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 *
 **/
public class Demo {

    @Test
    public void fun1()
    {
        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer= new Customer();
        customer.setCust_name("Google 公司");
        session.save(customer);
        transaction.commit();
        sessionFactory.close();
    }

}
