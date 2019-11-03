package com.itcast.b_api;

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

    //查询
    @Test
    public void fun1()
    {
        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, 2l);

        System.out.println(customer);
        transaction.commit();
        sessionFactory.close();
    }

    //新增
    @Test
    public void fun2()
    {
        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer= new Customer();
        customer.setCust_name("传智博客");
        session.save(customer);
        transaction.commit();
        sessionFactory.close();
    }

    //修改
    @Test
    public void fun3()
    {
        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, 2l);
        customer.setCust_name("itcast");
        session.save(customer);
        transaction.commit();
        sessionFactory.close();
    }

    //修改
    @Test
    public void fun4()
    {
        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, 2l);
        customer.setCust_name("itcast");
        session.delete(customer);
        transaction.commit();
        sessionFactory.close();
    }

}
