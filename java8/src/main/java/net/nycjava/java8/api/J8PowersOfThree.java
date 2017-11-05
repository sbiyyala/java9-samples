package net.nycjava.java8.api;

import java.util.stream.IntStream;

public class J8PowersOfThree {

    // Print powers of 3 <= 1000000
    public static void main(String[] args) {
        IntStream.range(0, 10)
                .forEach(x -> System.out.println(((int) Math.pow(3, x))));

        for (int i = 1; i <= 1000000; i = i * 3) {
            System.out.println(i);
        }

    }
}
