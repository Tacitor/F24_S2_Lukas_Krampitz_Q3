package com.jwetherell.algorithms.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void multiplicationReg() {
        int inA = 1;
        int inB = 1;
        long out = Multiplication.multiplication(inA, inB);
        assertEquals(1,out);
    }

    @Test
    void multiplicationZero() {
        int inA = 0;
        int inB = 1;
        long out = Multiplication.multiplication(inA, inB);
        assertEquals(0,out);
    }

    @Test
    void multiplicationZero2() {
        int inA = 0;
        int inB = 0;
        long out = Multiplication.multiplication(inA, inB);
        assertEquals(0,out);
    }

    @Test
    void multiplicationNeg() {
        int inA = -42;
        int inB = 12;
        long out = Multiplication.multiplication(inA, inB);
        assertEquals(-504,out);
    }

    @Test
    void multiplicationMax() {
        int inA = 2147483647;
        int inB = 2147483647;
        long out = Multiplication.multiplication(inA, inB);
        assertEquals(4611686014132420609L,out);
    }

    @Test
    void multiplyUsingRecursionReg() {
        int inA = 1;
        int inB = 1;
        long out = Multiplication.multiplyUsingRecursion(inA, inB);
        assertEquals(1,out);
    }

    @Test
    void multiplyUsingRecursionZero() {
        int inA = 0;
        int inB = 1;
        long out = Multiplication.multiplyUsingRecursion(inA, inB);
        assertEquals(0,out);
    }

    @Test
    void multiplyUsingRecursionZero2() {
        int inA = 0;
        int inB = 0;
        long out = Multiplication.multiplyUsingRecursion(inA, inB);
        assertEquals(0,out);
    }

    @Test
    void multiplyUsingRecursionNeg() {
        int inA = -42;
        int inB = 12;
        long out = Multiplication.multiplyUsingRecursion(inA, inB);
        assertEquals(-504,out);
    }

    @Test
    void multiplyUsingRecursionMax() {
        int inA = 2147483647;
        int inB = 2147483647;
        long out = Multiplication.multiplyUsingRecursion(inA, inB);
        assertEquals(4611686014132420609L,out);
    }

    @Test
    void multiplyUsingLoopReg() {
        int inA = 1;
        int inB = 1;
        long out = Multiplication.multiplyUsingLoop(inA, inB);
        assertEquals(1,out);
    }

    @Test
    void multiplyUsingLoopZero() {
        int inA = 0;
        int inB = 1;
        long out = Multiplication.multiplyUsingLoop(inA, inB);
        assertEquals(0,out);
    }

    @Test
    void multiplyUsingLoopZero2() {
        int inA = 0;
        int inB = 0;
        long out = Multiplication.multiplyUsingLoop(inA, inB);
        assertEquals(0,out);
    }

    @Test
    void multiplyUsingLoopNeg() {
        int inA = -42;
        int inB = 12;
        long out = Multiplication.multiplyUsingLoop(inA, inB);
        assertEquals(-504,out);
    }

    @Test
    void multiplyUsingLoopMax() {
        int inA = 2147483647;
        int inB = 2147483647;
        long out = Multiplication.multiplyUsingLoop(inA, inB);
        assertEquals(4611686014132420609L,out);
    }

    @Test
    void multiplyUsingShift() {
    }

    @Test
    void multiplyUsingLogs() {
    }

    @Test
    void multiplyUsingFFT() {
    }

    @Test
    void multiplyUsingLoopWithStringInput() {
    }

    @Test
    void multiplyUsingLoopWithIntegerInput() {
    }
}