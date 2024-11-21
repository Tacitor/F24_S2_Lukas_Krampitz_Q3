package com.jwetherell.algorithms.mathematics;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
class PrimesTest {

    @Test
    void getPrimeFactorization1() {
        Map<Long, Long> out = (Primes.getPrimeFactorization(5));

        Map<Long, Long> test = new HashMap<Long, Long>();
        test.put(2L , 0L);
        test.put(5L , 1L);

        assertEquals(test,out);
    }

    @Test
    void getPrimeFactorization0() {
        Map<Long, Long> out = (Primes.getPrimeFactorization(0));

        Map<Long, Long> test = new HashMap<Long, Long>();

        assertEquals(test,out);
    }

    @Test
    void isPrimeReg() {
        int in = 5;
        boolean out = Primes.isPrime(in);
        assertTrue(out);

        in = 6;
        out = Primes.isPrime(in);
        assertFalse(out);

        in = 7;
        out = Primes.isPrime(in);
        assertTrue(out);
    }

    @Test
    void isPrimeEdge0() {
        int in;
        boolean out;

        in = 0;
        out = Primes.isPrime(in);
        assertFalse(out);
    }

    @Test
    void isPrimeEdge1() {
        int in;
        boolean out;

        in = 1;
        out = Primes.isPrime(in);
        assertFalse(out);
    }

    @Test
    void sieveOfEratosthenes() {
    }

    @Test
    void millerRabinTest() {
    }
}