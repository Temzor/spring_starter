package com.spring.introduction.annotation;

import com.spring.introduction.config.SpringConfig;
import com.spring.introduction.di.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationPropertySource {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Person person = context.getBean("personBean", Person.class);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
