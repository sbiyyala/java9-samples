package net.nycjava.java9.api.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.ofNullable;

public class J9DropWhileDemo {

    public static void main(String[] args) {

//        List<Integer> maxDailyTempJan2017 = List.of(42, 40, 45, 36, 29, 41, 46, 46, 47, 59, 40, 44, 30, 38, 51,
//                52, 42, 31, 28, 37, 36, 30, 27, 35, 39, 48, 47, 42, 41, 39, 56);
//
//        long numberOfDaysAfterTheTemperatureReached50 = maxDailyTempJan2017.stream()
//                .dropWhile(temp -> temp < 50)
//                .count();
//
//        System.out.println(numberOfDaysAfterTheTemperatureReached50);

        //ofNullable("hello").findFirst();
        //Optional.ofNullable("hello").stream();
        System.out.println(concatName("Jim", null, "Fagan"));
    }

    static String concatName(String firstName, String middleName, String lastName) {
        return concat(ofNullable(firstName), ofNullable(middleName), ofNullable(lastName))
                .collect(joining(" "));
//        return Stream.of(ofNullable(firstName), ofNullable(middleName), ofNullable(lastName))
//                .flatMap(identity())
//                .collect(joining(" "));
    }

    static <T> Stream<T> concat(Stream<T>... streams) {
        return Arrays.asList(streams).stream().flatMap(identity());
    }
}
