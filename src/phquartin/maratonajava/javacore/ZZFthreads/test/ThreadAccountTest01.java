package phquartin.maratonajava.javacore.ZZFthreads.test;

import phquartin.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Goku");
        Thread t2 = new Thread(threadAccountTest01, "Buba");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FUDEU");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
        if(account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " esta indo sacar " + amount);
            account.whithdrawal(amount);
            System.out.println(Thread.currentThread().getName() + " restantes na conta " + account.getBalance());
            return;
        }
        System.out.println(Thread.currentThread().getName() + " nao vai sacar " + amount);
    }
}
