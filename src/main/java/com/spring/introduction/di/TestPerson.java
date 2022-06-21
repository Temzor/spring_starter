package com.spring.introduction.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person personDog = context.getBean("myPersonDog", Person.class);
        personDog.callYourPet();

        Person personCat = context.getBean("myPersonCat", Person.class);
        personCat.callYourPet();

        context.close();
    }
}
