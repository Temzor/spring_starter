package com.spring.introduction.waitnotify;

public class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                market.getBread();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
