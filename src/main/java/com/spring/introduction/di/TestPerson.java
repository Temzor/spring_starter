package com.spring.introduction.di;

import com.spring.introduction.ioc.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);

        Person person = new Person(pet);
        person.callYourPet();

    }
}
