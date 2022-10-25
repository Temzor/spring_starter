/**
package com.hibernatetest;

import com.hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestRequestHQL {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            var employees = session.createQuery("from Employee")
                            .getResultList();

            for (Object employee : employees) {
                System.out.println(employee);
            }


            var employees1 = session.createQuery("from Employee WHERE name = 'Alexandr'")
                    .getResultList();

            for (Object employee : employees1) {
                System.out.println(employee);
            }


            var employees2 = session.createQuery("from Employee WHERE salary > 650000")
                    .getResultList();

            for (Object employee : employees2) {
                System.out.println(employee);
            }


            session.getTransaction().commit();
            System.out.println("Done.");
        }
    }
}
*/