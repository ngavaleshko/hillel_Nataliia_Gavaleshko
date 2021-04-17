package hw28.functionalInterface;

@FunctionalInterface
public interface FunctionInterface<T, R> {

    String transform(T t);

}
