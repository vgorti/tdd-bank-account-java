package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoneyTest {

    @Test
    public void addAmount() {
        Money amt1 = new Money (1);
        Money amt2 = new Money(5);

        Money sumUp = amt1.add(amt2);

        assertThat(sumUp).isEqualTo(new Money(6));
    }
}
