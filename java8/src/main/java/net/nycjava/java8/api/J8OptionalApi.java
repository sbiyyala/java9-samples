package net.nycjava.java8.api;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class J8OptionalApi {


    public static void main(String[] args) {

        System.out.println(concatName("John", null, "Doe"));
        System.out.println(concatName("Madonna", null, null));
        System.out.println(concatName("Guido", "Van", "Rossum"));
    }

    private static String concatName(String first, String middle, String last) {

        return Stream.of(Optional.ofNullable(first), Optional.ofNullable(middle), Optional.ofNullable(last))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(joining(" "));
    }
}
