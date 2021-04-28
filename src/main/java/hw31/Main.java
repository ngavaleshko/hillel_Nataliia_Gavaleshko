package hw31;


import hw31.lock.Locker;
import hw31.thread.CustomRunnable;
import hw31.thread.CustomRunnable2;

public class Main {
    public static Locker locker = new Locker();

    public static void main(String[] args) throws InterruptedException {
        CustomRunnable customRunnable = new CustomRunnable();
        Thread threadRunnable = new Thread(customRunnable);
        threadRunnable.start();
        threadRunnable.join();


        CustomRunnable2 customRunnable2 = new CustomRunnable2();
        Thread customRunnableThread = new Thread(customRunnable2);
        customRunnableThread.start();
        customRunnableThread.join();



        /**
         * Task #2
         * Lock
         */
        Thread thread = new Thread(new Runnable() {
            private Locker locks = locker;

            @Override
            public void run() {

               locks.print();
                locks.write();
                locks.goodBye();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            private Locker locks = locker;

            @Override
            public void run() {
                locks.print();
                locks.write();
                locks.goodBye();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            private Locker locks = locker;

            @Override
            public void run() {
                locks.print();
                locks.write();
                locks.goodBye();
            }
        });

        thread.start();
        thread2.start();
        thread3.start();

    }
}