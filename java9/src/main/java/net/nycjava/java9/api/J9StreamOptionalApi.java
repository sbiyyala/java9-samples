package net.nycjava.java9.api;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.joining;

public class J9StreamOptionalApi {

    public static void main(String[] args) {

        System.out.println(concatName1("Madonna", null, null));
        System.out.println(concatName1("Guido", "Van", "Rossum"));

        System.out.println(concatName2("James", "Arthur", "Gosling"));
        System.out.println(concatName2("John", null, "Doe"));
    }

    // Stream#ofNullable
    private static String concatName1(String firstName, String middleName, String lastName) {

        return Stream.of(Stream.ofNullable(firstName), Stream.ofNullable(middleName), Stream.ofNullable(lastName))
                .flatMap(identity())
                .collect(joining(" "));
    }

    // Optional#stream
    private static String concatName2(String first, String middle, String last) {

        return Stream.of(Optional.ofNullable(first), Optional.ofNullable(middle), Optional.ofNullable(last))
                .flatMap(Optional::stream)
                .collect(joining(" "));
    }
}
