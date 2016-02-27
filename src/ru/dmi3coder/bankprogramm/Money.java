package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/26/16;11:47 AM.
 */
public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }
    abstract Money times(int multiplier);

    public static Franc franc(int amount) {
        return new Franc(amount);
    }
}
