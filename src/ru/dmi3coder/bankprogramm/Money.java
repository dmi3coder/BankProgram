package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/26/16;11:47 AM.
 */
public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier){
        return new Money(amount * multiplier,currency);
    }




    public static Dollar dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    String currency(){
        return currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return amount+" "+currency;
    }
}
