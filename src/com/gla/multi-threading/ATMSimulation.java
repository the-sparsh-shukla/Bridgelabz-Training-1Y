class SharedBankAccount {
    private int balance;

    public SharedBankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(String user, int amount) {
        System.out.println(user + " trying to withdraw " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println(user + " withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println(user + " withdrawal failed. Insufficient balance: " + balance);
        }
    }
}

class ATMUser extends Thread {
    private final SharedBankAccount account;
    private final int amount;

    public ATMUser(String name, SharedBankAccount account, int amount) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(getName(), amount);
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        SharedBankAccount account = new SharedBankAccount(10000);

        Thread u1 = new ATMUser("User-A", account, 4500);
        Thread u2 = new ATMUser("User-B", account, 3000);
        Thread u3 = new ATMUser("User-C", account, 4000);

        u1.start();
        u2.start();
        u3.start();
    }
}
