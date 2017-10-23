package jug.api;

import java.util.*;

public class J9CollectionsApi {

    public static void main(String args[]) {

        System.out.println(String.format("Immutable List of integers using the new factory: %s",
                getImmutableListOfIds()));

        System.out.println(String.format("Immutable Set of integers using the new factory: %s",
                getDaysOfWeek()));
    }


    private static List<Integer> getImmutableListOfIds() {
        return List.of(1, 2, 3);
    }

    private static Set<String> getDaysOfWeek() {
        return Set.of("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");
    }
}