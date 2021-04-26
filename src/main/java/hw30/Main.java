package hw30;

import hw30.deadlock.Bridge;
import hw30.deadlock.Stone;
import hw30.thread.CustomCallable;
import hw30.thread.CustomRunnable;
import hw30.thread.CustomThread;

import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        CustomCallable customCallable = new CustomCallable();
        customThread.start();
        customThread.join();

        FutureTask<String> task = new FutureTask<>(customCallable);
        Thread customCallableThread = new Thread(task);
        customCallableThread.start();
        customCallableThread.join();

        CustomRunnable customRunnable = new CustomRunnable();
        Thread threadRunnable = new Thread(customRunnable);
        threadRunnable.start();
        threadRunnable.join();

        /**
         * Task 5.1
         * 2998-2999
         */

        /**
         * Task 5.2
         * 2999-2999
         */

        /**
         * Task 5.3
         * 2999-2999
         */

        /**
         * Task 6 Deadlock
         */

        Stone stone = new Stone();
        Bridge bridge =new Bridge();

        stone.setBridge(bridge);
        bridge.setStone(stone);

        Thread thread =new Thread(()->System.out.println(stone.getStringFromBridge()));
        Thread thread2 =new Thread(()->System.out.println(bridge.getStringFromStone()));

        thread.start();
        thread2.start();


    }
}
