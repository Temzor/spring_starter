package com.spring.introduction.beanscope;

/*
  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBeanScope.xml", "applicationContext.xml"); Invariant ro use.
 */

import com.spring.introduction.ioc.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");


        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        System.out.println("Переменные ссылаются на один и тот же объект? "
                + (myDog == yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();

    }
}
