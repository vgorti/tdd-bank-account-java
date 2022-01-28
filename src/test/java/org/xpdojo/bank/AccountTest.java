package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.AccountBuilder.anAccount;

public class AccountTest {

    @Test
    public void depositAnAmountToEmptyAccount() {
        Account account = anAccount().withBalance(new Money(0)).build();
        Money amount = new Money(10);

        Money balance = account.deposit(amount);

        assertThat(balance).isEqualTo(amount);
    }

}
