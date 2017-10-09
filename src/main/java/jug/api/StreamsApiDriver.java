package jug.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApiDriver {

    public static void main(String[] args) {
        System.out.println("Stream-iterate in Java 8");
        iterate_java8();

        System.out.println("Stream-iterate-filter in Java 9");
        iterate_java9();

        List<String> names = new ArrayList<>();
        names.add("Gosling");
        names.add(null);
        names.add("Crockford");
        names.add("Rossum");
        names.add(null);

        // TODO: comment about the performance of these
        System.out.println("Filter out nulls java 8");
        System.out.println(filterOutNulls_J8(names));

        System.out.println("Filter out nulls java 9");
        System.out.println(filterOutNulls_J9(names));

        // TODO: comment on performance implications
        List<Integer> ids = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Predicate<Integer> lessThan5 = x -> x<5;
        System.out.println("Stream funneling: Java8");
        System.out.println(funnel_J8(ids, lessThan5));

        System.out.println("Stream funneling: Java9");
        System.out.println(funnel_J9(ids, lessThan5));
    }

    private static List<Integer> funnel_J9(List<Integer> ids, Predicate<Integer> lessThan5) {
        return ids.stream()
                .takeWhile(lessThan5)
                .collect(Collectors.toList());
    }

    private static List<Integer> funnel_J8(List<Integer> ids, Predicate<Integer> lessThan5) {

        return ids.stream()
                .filter(lessThan5)
                .collect(Collectors.toList());
    }

    private static List<String> filterOutNulls_J9(List<String> names) {

        return names.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private static List<String> filterOutNulls_J8(List<String> names) {
        return names.stream()
                .flatMap(Stream::ofNullable)
                .collect(Collectors.toList());
    }

    // becomes hairy when used with a filter
    private static void iterate_java8() {

        Stream.iterate(3, x -> x+1)
                .limit(3)
                .forEach(System.out::println);
    }

    private static void iterate_java9() {

        Stream.iterate(1, x -> x <= 3, x -> x+1)
                .forEach(System.out::println);
    }
}
