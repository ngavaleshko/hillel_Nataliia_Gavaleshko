package hw27.Implementation;

import hw27.Interfaces.AInterface;
import hw27.Interfaces.BInterface;

public class First implements AInterface, BInterface {
    @Override
    public void eat(Integer integer) {
        System.out.println("first.eat :" + integer);
    }

    @Override
    public void dream(String string) {
        System.out.println("first.dream : " + string);
    }
}