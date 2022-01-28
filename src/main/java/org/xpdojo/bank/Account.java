package org.xpdojo.bank;

public class Account {
    private final Money balance;

    public Account(Money balance) {
        this.balance = balance;
    }

    public Money deposit(Money amount) {
        return amount;
    }
}
