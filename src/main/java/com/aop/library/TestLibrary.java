package com.aop.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLibrary {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Library library = context.getBean("library", Library.class);
        library.getBook();

        context.close();
    }
}
