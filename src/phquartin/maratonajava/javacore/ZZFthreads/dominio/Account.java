package phquartin.maratonajava.javacore.ZZFthreads.dominio;

public class Account {
    private int balance = 50;

    public void whithdrawal(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
