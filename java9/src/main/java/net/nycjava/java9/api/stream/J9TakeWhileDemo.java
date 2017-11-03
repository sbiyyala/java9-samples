package net.nycjava.java9.api.stream;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class J9TakeWhileDemo {

    public static void main(String[] args) {
        List<Integer> ids = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println(
                ids.stream()
                        .takeWhile(x -> x < 5)
                        .collect(toList())
        );
    }
}