package hw30.thread;

import hw30.impl.Implementation;
import lombok.SneakyThrows;

import java.util.concurrent.Callable;

public class CustomThread extends Thread {

    @SneakyThrows
    @Override
    public void run() {
        Thread.currentThread().setName("Custom Thread: ");
        for (int i = 0; i < 1000; i++) {
            Implementation.reader(Thread.currentThread());
        }
    }
}