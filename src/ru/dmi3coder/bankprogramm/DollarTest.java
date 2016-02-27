package ru.dmi3coder.bankprogramm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmi3coder on 2/22/16;10:11 AM.
 */
public class DollarTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMultiplication(){
        Money five= Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    public void testFrankMultiplication(){
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(6)));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.franc(1).currency());
    }

    @Test
    public void  testDifferentClassEquality(){
        assertTrue(new Money(10,"CHF").equals(new Franc(10,"CHF")));

    }


}