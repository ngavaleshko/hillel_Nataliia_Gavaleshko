package hw27.Interfaces;

public interface AInterface {
    default void simple(int a, int b) {
        System.out.println("BigBang");
    }

    static void print(String string) {
        System.out.println(string);
    }

    void eat(Integer integer);

    void dream(String string);
}