package hw30.thread;

import hw30.impl.Implementation;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("Custom Runnable Thread: ");
        for (int i = 0; i < 1000; i++) {
            Implementation.reader(Thread.currentThread());
        }
    }
}
