package com.hibernatetest2;


import com.hibernatetest.entity.Employee;
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
            Employee employee = new Employee("Alexandr", "Ivanov", "IT", 600_000);

            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();

            System.out.println("Done.");
        }
    }
}