package hw28.functionalInterface;

@FunctionalInterface
public interface ConsumerInterface<T> {
    void accept(T t);
}
