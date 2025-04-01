package phquartin.maratonajava.javacore.ZZGconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }
    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }
    public void addEmail(String email) {
        lock.lock();
        try {
            emails.add(email);
            System.out.println(Thread.currentThread().getName() + " adicionou o email " + email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String removeEmail() throws InterruptedException {
        lock.lock();
        try {
            while(this.emails.isEmpty()) {
                if(!open) {
                    return null;
                }
                System.out.println(Thread.currentThread().getName() + " nao tem email, entrando em espera");
                condition.await();
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que nao estamos mais pegando emails");
            condition.signalAll();
        } finally {
            lock.unlock();

        }
    }

}
