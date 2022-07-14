package com.hibernate_test;


import com.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Dmitrii", "Kapustin", "IT", 100_000);

            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
    }
}
