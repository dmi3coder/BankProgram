package ru.dmi3coder.bankprogramm;

/**
 * Created by dmi3coder on 3/1/16;2:58 PM.
 */
public class Pair {
    private String from;
    private String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object obj) {
        Pair pair = (Pair)obj;
        return from.equals(pair.from)&& to.equals(pair.to);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
