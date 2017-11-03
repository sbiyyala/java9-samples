package net.nycjava.java9.api.stream;

import java.util.stream.Stream;

public class J9PowersOfTwoLessThan {

    // Print powers of 2 <= 1000000
    public static void main(String[] args) {

        Stream.iterate(1, x -> x <= 1000000, x -> x * 2)
                .forEach(System.out::println);
    }
}
