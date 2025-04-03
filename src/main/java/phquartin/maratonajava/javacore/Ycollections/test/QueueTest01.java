package phquartin.maratonajava.javacore.Ycollections.test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Pedro");
        queue.add("Joao");
        queue.add("Maria");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
