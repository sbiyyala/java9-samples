package net.nycjava.java8.api;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Collections.unmodifiableMap;
import static java.util.stream.Collectors.toMap;

public class J8MapApi {

    public static void main(String[] args) {

        Map<Integer, String> unmodifiableMap1 = unmodifiableMap(
                new HashMap<Integer, String>() {{
                    put(1, "Gosling");
                    put(2, "Crockford");
                    put(3, "Odersky");
                    put(4, "Crockford");
                }});

        Map<Integer, String> unmodifiableMap2 = unmodifiableMap(
                Stream.of(
                        new SimpleEntry<>(1, "Gosling"),
                        new SimpleEntry<>(2, "Crockford"),
                        new SimpleEntry<>(3, "Odersky"),
                        new SimpleEntry<>(4, "Crockford"))
                        .collect(toMap(SimpleEntry::getKey, SimpleEntry::getValue)));

        System.out.println(unmodifiableMap1);
        System.out.println(unmodifiableMap2);
    }

}
