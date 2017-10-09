package jug.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.valueOf;

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
