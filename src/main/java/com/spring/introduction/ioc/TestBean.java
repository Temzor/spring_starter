package com.spring.introduction.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet petDog = context.getBean("myPetDog", Pet.class);
        petDog.say();

        Pet petCat = context.getBean("myPetCat", Pet.class);
        petCat.say();

        context.close();
    }
}
