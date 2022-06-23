package com.spring.introduction.annotation;

import com.spring.introduction.ioc.Cat;
import com.spring.introduction.ioc.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();

        context.close();
    }
}
