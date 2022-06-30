package com.aop.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLibrary {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.returnBook();
        uniLibrary.getMagazine();

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();

        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook(book);

        context.close();
    }
}
