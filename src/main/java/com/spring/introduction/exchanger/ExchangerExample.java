package com.spring.introduction.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> actionUserOne = new ArrayList<>();
        List<Action> actionUserTwo = new ArrayList<>();

        actionUserOne.add(Action.NOJNICI);
        actionUserOne.add(Action.KAMEN);
        actionUserOne.add(Action.BUMAGA);
        actionUserOne.add(Action.NOJNICI);

        actionUserTwo.add(Action.KAMEN);
        actionUserTwo.add(Action.BUMAGA);
        actionUserTwo.add(Action.NOJNICI);
        actionUserTwo.add(Action.BUMAGA);

        new UserGame("Dima", actionUserOne, exchanger);
        new UserGame("Olga", actionUserTwo, exchanger);
    }
}
