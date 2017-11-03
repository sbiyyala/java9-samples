package net.nycjava.java8.api;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J8MapApi {

    private static final Map<Integer, String> idToNames = Collections
            .unmodifiableMap(new HashMap<Integer, String>() {{
                put(1, "Gosling");
                put(2, "Crockford");
                put(3, "Odersky");
                put(4, "Crockford");
            }});

    public static void main(String[] args) {

        // SB - please inline as appropriate to make it easy to walk through the code from top to bottom

        System.out.println(idToNames);
        System.out.println("=== OR ====");  // remove clutter where possible
        System.out.println(getIdToNames());
    }

    private static Map<Integer, String> getIdToNames() {

        return Collections.unmodifiableMap(Stream.of( // static import
                new SimpleEntry<>(1, "Gosling"),
                new SimpleEntry<>(2, "Crockford"),
                new SimpleEntry<>(3, "Odersky"),
                new SimpleEntry<>(4, "Crockford"))
                .collect(Collectors.toMap(
                        SimpleEntry::getKey, SimpleEntry::getValue)
                ));
    }
}
