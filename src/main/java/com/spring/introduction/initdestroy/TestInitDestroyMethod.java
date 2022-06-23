package com.spring.introduction.initdestroy;

import com.spring.introduction.ioc.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInitDestroyMethod {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextInitDestroy.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }
}
