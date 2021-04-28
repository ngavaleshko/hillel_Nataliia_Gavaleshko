package hw31.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locker {
        Lock lock = new ReentrantLock();
        public void print() {
            lock.lock();
                String jiva =Thread.currentThread().getName();
                System.out.println(jiva);
                System.out.println("printprintprintprint");

        }
    public void goodBye() {

            String jiva =Thread.currentThread().getName();
            System.out.println(jiva);
            System.out.println("roses");

    }
        public void write() {
                String jiva =Thread.currentThread().getName();
                System.out.println(jiva);
                System.out.println("write");
            lock.unlock();
        }
    }


