package hw27.Interfaces;

public interface DInterface extends CInterface {
    default void simple(int a, int b) {
        int S = a - b;
        System.out.println("Default S = a - b =" + S);
    }

    static void print(int d) {
        System.out.println("DInterface static: " + d);
    }

    void eat(Integer integer);

    void dream(String string);
}