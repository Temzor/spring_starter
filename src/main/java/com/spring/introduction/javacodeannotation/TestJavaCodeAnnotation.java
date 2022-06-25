package com.spring.introduction.javacodeannotation;

import com.spring.introduction.config.SpringConfig;
import com.spring.introduction.di.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaCodeAnnotation {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
