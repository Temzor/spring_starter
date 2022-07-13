package com.aop.library;

import com.aop.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AroundTest {
    public static void main(String[] args) {
        System.out.println("Method main starts.");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу " + bookName);


        context.close();
        System.out.println("Method main ends.");
    }
}
