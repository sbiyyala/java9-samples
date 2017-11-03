package net.nycjava.java9.api;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class J9StreamsApi {

    public static void main(String[] args) {


        System.out.println("Stream-iterate-filter in Java 9");
        Stream.iterate(1, x -> x <= 3, x -> x + 1)
                .forEach(System.out::println);

        List<String> names = List.of("Gosling", null, "Crockford", "Rossum", null);

        System.out.println("Filter out nulls java 9");
        System.out.println(filterOutNulls(names));

        // TODO: comment on performance implications
        List<Integer> ids = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Predicate<Integer> lessThan5 = x -> x < 5;

        System.out.println("Stream funneling: Java9");
        System.out.println(funnel(ids, lessThan5));

        System.out.println("Stream funneling(negative Predicate): Java9");
        System.out.println(drop(ids, lessThan5));

        System.out.println("Count of elements in sorted collection obeying a predicate: Java9");
        System.out.println(funnelCount_J9(ids, lessThan5));
    }

    private static long funnelCount_J9(List<Integer> ids, Predicate<Integer> lessThan5) {

        return ids.stream()
                .takeWhile(lessThan5)
                .count();
    }

    private static List<Integer> funnel(List<Integer> ids, Predicate<Integer> lessThan5) {

        return ids.stream()
                .takeWhile(lessThan5)
                .collect(toList());
    }

    private static List<Integer> drop(List<Integer> ids, Predicate<Integer> lessThan5) {

        return ids.stream()
                .dropWhile(lessThan5)
                .collect(toList());
    }

    private static List<String> filterOutNulls(List<String> names) {

        return names.stream()
                .flatMap(Stream::ofNullable)
                .collect(toList());
    }
}
