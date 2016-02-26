package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/26/16;11:43 AM.
 */
public class Frank extends Money {
    Frank(int amount){this.amount = amount;}

    Frank times(int multiplier){return new Frank(amount * multiplier);}

}
