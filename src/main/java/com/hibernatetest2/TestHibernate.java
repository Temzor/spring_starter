package com.hibernatetest2;


import com.hibernatetest2.entity.Detail;
import com.hibernatetest2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

    public static void main(String[] args) {
        Session session = null;

        /* Add Employee */
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {

            session = factory.getCurrentSession();

            Detail detail = new Detail("Moscow", "+79211265471", "olejka@mail.ru");
            Employee employee = new Employee("Oleg", "Petrov", "Sales", 700_000);

            employee.setEmpDetail(detail);

            session.beginTransaction();


            session.persist(employee);

            session.getTransaction().commit();

            System.out.println("Done.");
        } finally {
            assert session != null;
            session.close();
        }

        /* Print Employee */
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {

            session = factory.getCurrentSession();


            session.beginTransaction();
            Employee employee = session.get(Employee.class, 20);
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();

            System.out.println("Done.");
        } finally {
            session.close();
        }

        /* Remove Employee */

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 4);
            session.remove(employee);

            session.getTransaction().commit();

            System.out.println("Done.");
        } finally {
            session.close();
        }
    }
}