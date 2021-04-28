package hw31.impl;

public class Implementation {
    public static int low = 0;

    public synchronized static String reader(Thread thread) {
      String nameReader = thread.getName() + low++;
        System.out.println(nameReader);
        return nameReader;
    }
}
