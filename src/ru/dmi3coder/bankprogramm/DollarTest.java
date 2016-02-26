package ru.dmi3coder.bankprogramm;

import org.junit.Test;
import ru.dmi3coder.bankprogramm.Dollar;

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
        Dollar five= new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15),five.times(3));
    }

    @Test
    public void testFrankMultiplication(){
        Frank five = new Frank(5);
        assertEquals(new Frank(10),five.times(2));
        assertEquals(new Frank(15),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Dollar(5).times(3).equals(new Dollar(15)));
    }


}