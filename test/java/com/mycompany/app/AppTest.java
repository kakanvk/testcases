package com.mycompany.app;

import org.junit.Test;

public class AppTest {

    @Test
    public void testIsPrime() {
        int accepted = 0;
        int total = 0;

        // Test cases for prime numbers
        int[] primeNumbers = {2, 3, 5, 7, 11, 7919, 1257787, 3021377};
        total += primeNumbers.length;

        for (int number : primeNumbers) {
            if (App.isPrime(number)) {
                accepted++;
            }
        }

        // Test cases for non-prime numbers
        int[] nonPrimeNumbers = {4, 6, 8, 9, 10, 12};
        total += nonPrimeNumbers.length;

        for (int number : nonPrimeNumbers) {
            if (!App.isPrime(number)) {
                accepted++;
            }
        }

        System.out.println("Accepted: " + accepted + "/" + total);
    }
}
