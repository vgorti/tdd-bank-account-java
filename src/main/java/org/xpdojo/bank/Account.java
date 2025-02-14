package org.xpdojo.bank;

public class Account {
    private final Money balance;

    public Account(Money balance) {
        this.balance = balance;
    }

    public Money deposit(Money amount) {
        return balance.add(amount);
    }

    public Money withdraw(Money withdrawAmount) {
        return balance.subtract(withdrawAmount);
    }
}
