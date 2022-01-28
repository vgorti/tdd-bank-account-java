package org.xpdojo.bank;

public class AccountBuilder {
    private Money balance;

    public static AccountBuilder anAccount() {
        return new AccountBuilder();
    }

    public AccountBuilder withBalance(Money balance) {
        this.balance = balance;
        return this;
    }

    public Account build() {
        return new Account(balance);
    }
}
