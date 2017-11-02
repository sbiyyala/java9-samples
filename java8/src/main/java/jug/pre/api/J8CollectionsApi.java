package jug.pre.api;

import java.util.*;

public class J8CollectionsApi {
    public static void main(String args[]) {

        System.out.println(String.format("Immutable List of integers before java 9: %s", getImmutableListOfIds()));
        System.out.println(String.format("Immutable Set before java 9:  %s", getDaysOfWeek()));
    }

    private static List<Integer> getImmutableListOfIds() {
        return Collections.unmodifiableList(Arrays.asList(1, 2, 3));
    }

    private static Set<String> getDaysOfWeek() {
        return Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
                "MON", "TUE", "WED",
                "THU", "FRI", "SAT", "SUN")));
    }
}
