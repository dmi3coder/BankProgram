package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/29/16;5:16 PM.
 */
public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

}
