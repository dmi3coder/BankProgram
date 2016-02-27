package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/26/16;11:43 AM.
 */
public class Franc extends Money {
    Franc(int amount){this.amount = amount;}

    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }

}
