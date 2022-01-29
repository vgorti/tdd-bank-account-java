package org.xpdojo.bank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Money {
    private final float amt;

    public Money(float amount) {
        this.amt = amount;
    }

    public Money add(Money currentAmount) {
        return new Money(amt + currentAmount.amt);
    }

    public Money subtract(Money withdrawAmount) {
        return new Money( amt - withdrawAmount.amt);
    }
}
