package com.spring.introduction.interruptionthread;

public class InterruptionThread extends Thread {

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Thread has is interrupted.");
                System.out.println("Убедились что состояние всех объектов нормальное и решили завершить поток.");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна. "
                        + "Давайте завершим его работу");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
