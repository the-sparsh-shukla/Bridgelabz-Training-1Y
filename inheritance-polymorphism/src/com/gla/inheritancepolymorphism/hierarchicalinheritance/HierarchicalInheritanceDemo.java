package com.gla.inheritancepolymorphism.hierarchicalinheritance;

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("SB101", 10000),
                new CheckingAccount("CA201", 8000),
                new FixedDepositAccount("FD301", 50000)
        };
        for (BankAccount account : accounts) {
            System.out.println(account.getAccountType());
        }

        Person[] people = {new Teacher("Asha"), new Student("Rahul"), new Staff("Pooja")};
        for (Person person : people) {
            System.out.println(person.getRole());
        }
    }
}
