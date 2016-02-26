package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/26/16;11:43 AM.
 */
public class Frank {
    private int amount;
    Frank(int amount){this.amount = amount;}

    Frank times(int multiplier){return new Frank(amount * multiplier);}

    @Override
    public boolean equals(Object object) {
        Frank frank = (Frank)object;
        return amount == frank.amount;
    }
}
