package hw31.thread;


import java.util.concurrent.atomic.AtomicInteger;

public class CustomRunnable implements Runnable {
    private static AtomicInteger atomicInteger = new AtomicInteger(10000);

    @Override
    public void run() {

        System.out.println("  CR2 Before decrement " + atomicInteger);
        for (int i = 10000; 0 < i; i--) {
            System.out.println("CR Decrement and get " +
                    atomicInteger.decrementAndGet());
        }
    }
}
