package com.spring.introduction.config;

import com.spring.introduction.di.Person;
import com.spring.introduction.ioc.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfigFile {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
