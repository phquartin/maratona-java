package phquartin.maratonajava.javacore.ZZFthreads.test;


class ThreadExampleRunnable2 implements Runnable {
    private final String c;
    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
            Thread.yield();
        }
    }
}

public class ThreadsTest02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        Thread t3 = new Thread(new ThreadExampleRunnable2("HA"));
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
    }
}
