package com.spring.introduction.exchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

public class UserGame extends Thread {
    private final String name;
    private final List<Action> myActions;
    private final Exchanger<Action> exchanger;

    public UserGame(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.KAMEN && friendsAction == Action.NOJNICI)
                || (myAction == Action.NOJNICI && friendsAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)) {
            System.out.println(name + " ВЫЙГРАЛ!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
