package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 2/29/16;5:18 PM.
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
