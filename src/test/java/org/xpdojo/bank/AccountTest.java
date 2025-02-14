package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.AccountBuilder.anAccount;

public class AccountTest {

    private static final Money ZERO_MONEY = new Money(0);

    @Test
    public void depositAnAmountToEmptyAccount() {
        Account account = anAccount().withBalance(ZERO_MONEY).build();
        Money amount = new Money(10);

        Money balance = account.deposit(amount);

        assertThat(balance).isEqualTo(amount);
    }

    @Test
    public void depositAnAmountToAccountToIncreaseBalance() {
        Money currentBalance = new Money(10);
        Account account = anAccount().withBalance(currentBalance).build();
        Money amount = new Money(10);

        Money balance = account.deposit(amount);

        assertThat(balance).isEqualTo(new Money(20));
    }

    @Test
    public void withdrawAnAmountFromAccountWillDecreaseInBalance() {
        Money totalBalance = new Money(50);
        Account account = anAccount().withBalance(totalBalance).build();
        Money withdrawAmount = new Money(5);

        Money balance = account.withdraw(withdrawAmount);

        assertThat(balance).isEqualTo(new Money(45));
    }

}
