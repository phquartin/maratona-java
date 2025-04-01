package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.offer("1"));
        System.out.println(tq.offer("1", 10, TimeUnit.SECONDS));
        tq.put("a");
        if (tq.hasWaitingConsumer()){
            tq.transfer("a");
        }
        System.out.println(tq.tryTransfer("a"));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
    }
}
