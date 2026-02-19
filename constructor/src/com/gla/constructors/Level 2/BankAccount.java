class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = "ACC123";
        s.accountHolder = "Raj";
        s.setBalance(10000);
        s.display();
        System.out.println("Balance: " + s.getBalance());
    }
}
