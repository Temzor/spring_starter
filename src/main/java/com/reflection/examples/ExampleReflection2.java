package com.reflection.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExampleReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("com.reflection.examples.Employee");
        /**
         * Create objects
         * Employee e = (Employee) employeeClass.newInstance();
         * System.out.println(e);
         */

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee o1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object o2 = constructor2.newInstance(5, "Dmitrii", "IT");
        System.out.println(o2);

        /**
         * Reuse method/.
         */
        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(o2, 700.50);
        System.out.println(o2);



    }
}

