package phquartin.maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames { // Possui um problema mesmo com os atributos synchronized. Os metodos que acessam tambem precisam ser synchronized
    private final List<String> names = Collections.synchronizedList(new ArrayList<String>());

    public void add(String name) {
        names.add(name);
    }
    public void removeFirst(){
        if(!names.isEmpty()){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Julio");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
