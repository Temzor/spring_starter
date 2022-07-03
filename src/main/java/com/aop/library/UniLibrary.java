package com.aop.library;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary.");
    }

    public void returnBook() {
        System.out.println("Мы возвращем книгу в UniLibrary.");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary.");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращем журнал в UniLibrary.");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary.");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary.");
    }
}
