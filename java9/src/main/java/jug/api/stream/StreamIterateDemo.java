package jug.api.stream;

import java.util.stream.Stream;

public class StreamIterateDemo {

    public static void main(String[] args) {
        // Print primes less than 100
        Stream.iterate(1, x -> x <= 100, x -> x+1)
                .filter(StreamIterateDemo::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }

        for (int i = 2; i*i <= N; i++) {
            if (N%i == 0) {
                return false;
            }
        }

        return true;
    }
}
