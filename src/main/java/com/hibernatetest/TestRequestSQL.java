package com.hibernatetest;

import com.hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestRequestSQL {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Sidorov", "HR", 700_000);

            session.beginTransaction();
            session.save(employee);

            int myId = employee.getId();
            Employee employee1 = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(employee1);

            System.out.println("Done.");
        }
    }
}
