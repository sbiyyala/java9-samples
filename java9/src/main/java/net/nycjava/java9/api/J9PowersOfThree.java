package net.nycjava.java9.api;

import java.util.stream.IntStream;

public class J9PowersOfThree {

    // Print powers of 3 <= 1000000
    public static void main(String[] args) {

        IntStream.iterate(1, x -> x <= 1000000, x -> x * 3)
                .forEach(System.out::println);
    }
}
