package phquartin.maratonajava.javacore.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }
    public int pendingEmails() {
        synchronized (this.emails) {
            return emails.size();
        }
    }
    public void addEmail(String email) {
        synchronized (this.emails) {
            emails.add(email);
            System.out.println(Thread.currentThread().getName() + " adicionou o email " + email);
            this.emails.notifyAll();
        }
    }

    public String removeEmail() throws InterruptedException {
        synchronized (this.emails) {
            while(this.emails.isEmpty()) {
                if(!open) {
                    return null;
                }
                System.out.println(Thread.currentThread().getName() + " nao tem email, entrando em espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que nao estamos mais pegando emails");
        }
    }

}
