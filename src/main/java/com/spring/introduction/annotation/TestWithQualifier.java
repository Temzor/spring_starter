package com.spring.introduction.annotation;

import com.spring.introduction.di.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithQualifier {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
