package com.spring.introduction.beanscope;

import com.spring.introduction.ioc.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();

        context.close();

    }
}
