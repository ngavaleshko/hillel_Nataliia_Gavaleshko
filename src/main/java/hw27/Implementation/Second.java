package hw27.Implementation;

import hw27.Interfaces.CInterface;
import hw27.Interfaces.DInterface;

public class Second implements CInterface, DInterface {
    @Override
    public void eat(Integer integer) {
        System.out.println("second.eat : YOU EAT TOO MUCH " + integer);
    }

    @Override
    public void dream(String string) {
        System.out.println("Second.dream: " + string);
    }
}