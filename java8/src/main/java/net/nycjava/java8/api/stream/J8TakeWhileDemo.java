package net.nycjava.java8.api.stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class J8TakeWhileDemo {

    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println(
                ids.stream()
                        .filter(x -> x < 5)
                        .collect(toList())
        );
    }
}
