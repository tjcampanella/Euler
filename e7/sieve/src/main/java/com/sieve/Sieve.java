package com.sieve;

import java.util.ArrayList;

public class Sieve {

    public static ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] composites = new boolean[n + 1];
        for (int candidate = 2; candidate <= n; candidate++) {
            if (!composites[candidate]) {
                primes.add(candidate);
                for (int multiple = 2 * candidate; multiple <= n; multiple += candidate) {
                    composites[multiple] = true;
                }
            }
        }
        return primes;
    }
}
