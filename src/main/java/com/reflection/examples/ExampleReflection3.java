package com.reflection.examples;

import java.lang.reflect.Field;

public class ExampleReflection3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /**
         * Доступ к закрытым для изменнеия данным, через Reflection API;
         */
        Employee employee = new Employee(5, "Dmitrii", "IT");
        Class<? extends Employee> employeeClass = employee.getClass();

        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 500);
        System.out.println(salaryValue);
    }
}
