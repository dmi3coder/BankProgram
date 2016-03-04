package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/26/16;11:47 AM.
 */
public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }



    public static Money dollar(int amount) {
        return new Money(amount,"USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Expression times(int multiplier){
        return new Money(amount * multiplier,currency);
    }

    public Expression plus(Expression addend){
        return new Sum(this, addend);
    }
    String currency(){
        return currency;
    }

    public Money reduce(Bank bank,String to){
        int rate = bank.rate(currency,to);
        return new Money(amount/rate,to);
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
