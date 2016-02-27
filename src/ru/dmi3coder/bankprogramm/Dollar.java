package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/22/16;10:11 AM.
 */
public class Dollar extends Money {

    Dollar(int amount){
        this.amount = amount;
    }

    Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }


}
