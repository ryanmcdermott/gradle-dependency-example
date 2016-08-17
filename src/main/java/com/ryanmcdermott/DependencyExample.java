package com.ryanmcdermott.gradle;

import org.apache.commons.math3.primes.Primes;

public class DependencyExample {
    public static void main(String[] args) {
        int p = Primes.nextPrime(8);
        System.out.println("Dependency example -- Apache Commons Math3 via Gradle \n");
        System.out.println("Prime number closest to 8:");
        System.out.println(p);
    }
}
