package com.aop.library;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary.");
        System.out.println("-----------------------------------------------------");
    }

    public void returnBook() {
        System.out.println("Мы возвращем книгу в UniLibrary.");
        System.out.println("-----------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary.");
        System.out.println("-----------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращем журнал в UniLibrary.");
        System.out.println("-----------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary.");
        System.out.println("-----------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary.");
        System.out.println("-----------------------------------------------------");
    }
}
