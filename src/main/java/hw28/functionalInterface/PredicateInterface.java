package hw28.functionalInterface;

@FunctionalInterface
public interface PredicateInterface<T> {

    boolean incomeChecker(T t);
}
