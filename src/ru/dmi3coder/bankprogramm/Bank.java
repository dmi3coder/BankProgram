package ru.dmi3coder.bankprogramm;

import java.util.Hashtable;

/**
 * Created by dmi3coder on 2/29/16;5:18 PM.
 */
public class Bank {
    private Hashtable rates =  new Hashtable();

    public Money reduce(Expression source, String to) {
        return source.reduce(this,to);

    }
    int rate(String from, String to){
        if(from.equals(to))return 1;
        Integer rate = (Integer)rates.get(new Pair(from, to));
        return rate.intValue();
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from,to),new Integer(rate));
    }
}
