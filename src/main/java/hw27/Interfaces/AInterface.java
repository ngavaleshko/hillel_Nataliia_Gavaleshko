package hw27.Interfaces;

public interface AInterface {
    default void simple(int a, int b) {
        int S = a * b;
        System.out.println("BigBang" + S);
    }

    static void print(String string) {
        System.out.println(string);
    }

    void eat(Integer integer);

    void dream(String string);
}