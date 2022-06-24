package com.spring.introduction.annotation;

import com.spring.introduction.di.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithValue {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        Person person = context.getBean("personBean", Person.class);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
