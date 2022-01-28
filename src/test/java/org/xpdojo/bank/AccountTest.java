package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToEmptyAccount() {
        Account account = new Account();
        Money amount = new Money(10);

        Money balance = account.deposit(amount);

        assertThat(balance).isEqualTo(amount);
    }
}
