package com.hibernate_test;

import com.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUpdateHQL {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            employee.setSalary(150_000);


            session.createQuery("update Employee set salary = 100000 where name = 'Alexandr'")
                    .executeUpdate();


            session.getTransaction().commit();
            System.out.println("Done.");

        }
    }
}
