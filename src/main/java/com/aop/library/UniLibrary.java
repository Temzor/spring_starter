package com.aop.library;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary.");
    }

    String returnBook() {
        System.out.println("Мы возвращем книгу в UniLibrary.");
        return "OK!";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary.");
    }
}
