package com.sieve;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class SieveTest {
    @Test
    public void shouldExecute() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);

        assertTrue(Sieve.sieve(10).equals(expected));
    }
}
