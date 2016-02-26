package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/26/16;11:47 AM.
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
