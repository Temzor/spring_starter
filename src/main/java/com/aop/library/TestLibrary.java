package com.aop.library;

import com.aop.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLibrary {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Dmitrii", book);
        uniLibrary.addMagazine();

        context.close();
    }
}
