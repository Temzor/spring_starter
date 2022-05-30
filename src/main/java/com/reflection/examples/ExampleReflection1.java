package com.reflection.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ExampleReflection1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        /**
         * Method create object Class class at class #1.
         */
        Class employeeClass1 = Class.forName("com.reflection.examples.Employee");

        /**
         * Method create object Class class at class #2.
         */
        Class employeeClass2 = Employee.class;

        /**
         * Method create object Class class at class #3.
         */
        Employee employee = new Employee();
        Class employeeClass3 = employee.getClass();

        /**
         * Think at type class by using Reflection API.
         */

        Field someFiled = employeeClass1.getField("id");
        System.out.println("Type of id field = " + someFiled.getType());
        System.out.println("*******************************************************");

        /**
         * Think at types classes by using Reflection API.
         */
        Field[] fields = employeeClass1.getFields();
        for (Field field : fields) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType());
        }
        System.out.println("*******************************************************");

        /**
         * Private field access.
         */
        Field[] allFields = employeeClass1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType());
        }
        System.out.println("*******************************************************");

        /**
         * Method information by using Reflection API.
         */
        Method increaseSalary = employeeClass1.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + increaseSalary.getReturnType()
        + ", " + "parameter types = " + Arrays.toString(increaseSalary.getParameterTypes()));
        System.out.println("*******************************************************");

        /**
         * Method information with parameters by using Reflection API.
         */
        Method setSalaryInfo = employeeClass1.getMethod("setSalary", double.class);
        System.out.println("Return type of method increaseSalary = " + setSalaryInfo.getReturnType()
                + ", " + "parameter types = " + Arrays.toString(setSalaryInfo.getParameterTypes()));
        System.out.println("*******************************************************");

        /**
         * Methods information without private methods by using Reflection API.
         */
        Method[] methods = employeeClass1.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName()
                    + ", return type = " + method.getReturnType()
                    + ", parameter types" + Arrays.toString(setSalaryInfo.getParameterTypes()));
        }
        System.out.println("*******************************************************");

        /**
         * Methods information with private methods by using Reflection API.
         */
        Method[] allMethods1 = employeeClass1.getDeclaredMethods();
        for (Method method : allMethods1) {
            System.out.println("Name of method = " + method.getName()
                    + ", return type = " + method.getReturnType()
                    + ", parameter types" + Arrays.toString(setSalaryInfo.getParameterTypes()));
        }
        System.out.println("*******************************************************");

        /**
         * Methods information without private methods by using Reflection API.
         */
        Method[] allMethods2 = employeeClass1.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method = " + method.getName()
                        + ", return type = " + method.getReturnType()
                        + ", parameter types" + Arrays.toString(setSalaryInfo.getParameterTypes()));
            }
        }
        System.out.println("*******************************************************");

        /**
         * Get constructor by using Reflection API.
         */
        Constructor constructor = employeeClass1.getConstructor();
        System.out.println("Constructor has: " + constructor.getParameterCount()
        + " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
        System.out.println("*******************************************************");

        /**
         * Get constructor by using Reflection API, next constructor.
         */
        Constructor constructorSecond = employeeClass1.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has: " + constructorSecond.getParameterCount()
                + " parameters, their types are: " + Arrays.toString(constructorSecond.getParameterTypes()));
        System.out.println("*******************************************************");

        /**
         * Get all information constructor by using Reflection API.
         */
        Constructor[] allConstructor = employeeClass1.getConstructors();
        for (Constructor constructor1 : allConstructor) {
            System.out.println("Constructor " + constructor1.getName() + " has: " + constructor1.getParameterCount()
                    + " parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes()));
        }
        System.out.println("*******************************************************");
    }
}
