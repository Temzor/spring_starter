package com.aop.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLibrary {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.getMagazine();

        context.close();
    }
}
