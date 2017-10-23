package jug.pre.api;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class J8StreamsApi {

    public static void main(String[] args) {

        System.out.println("Stream-iterate in Java 8");
        // becomes hairy when used with a filter
        Stream.iterate(3, x -> x + 1)
                .limit(3)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("Gosling", null, "Crockford", "Rossum", null);

        List<Integer> ids = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // TODO: comment about the performance of these
        System.out.println("Filter out nulls java 8");
        System.out.println(filterOutNulls(names));

        Predicate<Integer> lessThan5 = x -> x < 5;
        System.out.println("Stream funneling: Java8");
        System.out.println(funnel(ids, lessThan5));

        System.out.println("Stream funneling(negative Predicate): Java8");
        System.out.println(drop(ids, lessThan5));

        System.out.println("Count of elements in sorted collection obeying a predicate: Java8");
        System.out.println(funnelCount(ids, lessThan5));
    }

    private static List<String> filterOutNulls(List<String> names) {

        return names.stream()
                .filter(Objects::nonNull)
                .collect(toList());
    }

    private static List<Integer> funnel(List<Integer> ids, Predicate<Integer> lessThan5) {

        return ids.stream()
                .filter(lessThan5)
                .collect(toList());
    }

    private static List<Integer> drop(List<Integer> ids, Predicate<Integer> lessThan5) {

        Predicate<Integer> moreThan = elem -> !lessThan5.test(elem);
        return ids.stream()
                .filter(moreThan)
                .collect(toList());
    }

    private static long funnelCount(List<Integer> ids, Predicate<Integer> lessThan5) {

        return ids.stream()
                .filter(lessThan5)
                .count();
    }
}
