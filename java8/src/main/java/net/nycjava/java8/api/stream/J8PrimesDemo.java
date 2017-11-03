package net.nycjava.java8.api.stream;

import java.util.stream.IntStream;

public class J8PrimesDemo {

    public static void main(String[] args) {
        // Print primes less than 100
        IntStream.range(0, 100)
                .filter(J8PrimesDemo::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(Integer N) {
        if (N < 2) {
            return false;
        }

        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }

        return true;
    }
}
