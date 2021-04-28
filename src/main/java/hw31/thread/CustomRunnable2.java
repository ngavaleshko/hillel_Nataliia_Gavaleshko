package hw31.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class CustomRunnable2 implements Runnable {
    private static AtomicInteger atomicInteger = new AtomicInteger(10000);

    @Override
    public void  run(){

        System.out.println("   Before decrement " + atomicInteger);
        for (int i = 10000; 0 < i; i--) {
            System.out.println("Decrement and get " +
                    atomicInteger.decrementAndGet());
        }
    }
}