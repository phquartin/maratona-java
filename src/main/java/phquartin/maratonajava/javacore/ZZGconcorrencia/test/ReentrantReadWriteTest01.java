package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock lock;

    public MapReadWrite(ReentrantReadWriteLock lock) {
        this.lock = lock;
    }
    public void put(String key, String value) {
        lock.writeLock().lock();
        try {
            System.out.printf("%s obteve o WRITE LOCK\n", Thread.currentThread().getName());
            map.put(key, value);
        }finally {
            lock.writeLock().unlock();
        }
    }
    public Set<String> getKeys() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.readLock().lock();
        try{
            System.out.printf("%s obteve o READ LOCK\n", Thread.currentThread().getName());
            Thread.sleep(500);
            return map.keySet();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite map = new MapReadWrite(rwl);

        Runnable write = () -> {
            for (int i = 0; i < 20; i++) {
                map.put("key" + i, "value" + i);
            }
        };
        Runnable read = () -> {
            if (rwl.isWriteLocked()) {
                System.out.printf("WRITE LOCKED");
            }
            System.out.println(Thread.currentThread().getName() + " " + map.getKeys());
        };
        new Thread(write).start();


        new Thread(read).start();
        new Thread(read).start();
    }
}
