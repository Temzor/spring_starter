package ru.codewars.sevenkyu.theoffice;

public class TheOffice {
    public static String boredom(Person[] staff) {
        int counter = 0;
        for (Person person : staff) {
            switch (person.department) {
                case "accounts":
                    counter += 1;
                    break;
                case "finance":
                    counter += 2;
                    break;
                case "canteen":
                    counter += 10;
                    break;
                case "regulation":
                    counter += 3;
                    break;
                case "trading":
                case "change":
                    counter += 6;
                    break;
                case "IS":
                    counter += 8;
                    break;
                case "retail":
                    counter += 5;
                    break;
                case "cleaning":
                    counter += 4;
                    break;
                default:
                    counter += 25;
                    break;
            }
        }
        return counter <= 80 ? "kill me now" : counter < 100 ? "i can handle this" : "party time!!";
    }
}
