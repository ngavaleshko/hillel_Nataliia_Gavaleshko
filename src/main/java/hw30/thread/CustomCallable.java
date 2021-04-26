package hw30.thread;

import hw30.impl.Implementation;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.currentThread().setName("Custom Callable Thread: ");
        for (int i = 0; i < 1000; i++) {
            Implementation.reader(Thread.currentThread());
        }
        return "message from CustomCallable with name: " + Thread.currentThread().getName();
    }
}