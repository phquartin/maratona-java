package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("e");
        System.out.printf("%s added the name value %s\n", Thread.currentThread().getName(), bq.peek());
        System.out.printf("%s is trying to add another value\n", Thread.currentThread().getName());
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("a");
        System.out.printf("%s added the name value %s\n", Thread.currentThread().getName(), bq.peek());
    }
    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;
        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s is going to sleep\n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s removing value %s\n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
