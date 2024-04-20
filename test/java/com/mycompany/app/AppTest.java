package com.mycompany.app;

import org.junit.Test;

public class AppTest {

    @Test
    public void testIsPrime() {
        int accepted = 0;
        int total = 0;

        // Test cases for prime numbers
        total += 7; // Number of prime numbers being tested

        if (App.isPrime(2)) accepted++;
        if (App.isPrime(3)) accepted++;
        if (App.isPrime(5)) accepted++;
        if (App.isPrime(7)) accepted++;
        if (App.isPrime(11)) accepted++;
        if (App.isPrime(7919)) accepted++;
        if (App.isPrime(1257787)) accepted++;
        if (App.isPrime(3021377)) accepted++;

        // Test cases for non-prime numbers
        total += 6; // Number of non-prime numbers being tested

        if (!App.isPrime(4)) accepted++;
        if (!App.isPrime(6)) accepted++;
        if (!App.isPrime(8)) accepted++;
        if (!App.isPrime(9)) accepted++;
        if (!App.isPrime(10)) accepted++;
        if (!App.isPrime(12)) accepted++;

        System.out.println("Accepted: " + accepted + "/" + total);
    }
}
