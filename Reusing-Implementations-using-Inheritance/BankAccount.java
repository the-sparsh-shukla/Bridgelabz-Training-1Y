package INHERITENCE;

public
    class BankAccount {
        protected String accountNumber;
        protected double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public void displayBasicInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + String.format("%.2f", balance));
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }
    }

    // SavingsAccount subclass
    class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        public void displayAccountType() {
            System.out.println("Account Type: Savings Account");
            displayBasicInfo();
            System.out.println("Interest Rate: " + (interestRate * 100) + "%");
            System.out.println("---");
        }

        public double calculateInterest() {
            return balance * interestRate;
        }
    }

    // CheckingAccount subclass
    class CheckingAccount extends BankAccount {
        private double withdrawalLimit;

        public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
            super(accountNumber, balance);
            this.withdrawalLimit = withdrawalLimit;
        }

        @Override
        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= withdrawalLimit && amount <= balance) {
                return super.withdraw(amount);
            }
            System.out.println("Withdrawal exceeds daily limit of $" + withdrawalLimit);
            return false;
        }

        public void displayAccountType() {
            System.out.println("Account Type: Checking Account");
            displayBasicInfo();
            System.out.println("Daily Withdrawal Limit: $" + String.format("%.2f", withdrawalLimit));
            System.out.println("---");
        }
    }

    // FixedDepositAccount subclass
    class FixedDepositAccount extends BankAccount {
        private int tenureMonths;

        public FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
            super(accountNumber, balance);
            this.tenureMonths = tenureMonths;
        }

        @Override
        public boolean

    }
