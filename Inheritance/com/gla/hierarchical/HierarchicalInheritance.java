package com.gla.hierarchical;


class BankAccount {
    int accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
}

class FixedDepositAccount extends BankAccount {
    int tenure;
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 1;
        s.balance = 1000;
        System.out.println("Savings Account");
    }
}
