package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.printf("%s: %s\n", Thread.currentThread().getName(), name);
            System.out.printf("%d Threads esperando\n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2 segundos\n", Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera\n", Thread.currentThread().getName());
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
    }
}
