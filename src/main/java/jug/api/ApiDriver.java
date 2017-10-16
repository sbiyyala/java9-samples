package jug.api;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;

/**
 * Created by shishir.biyyala on 10/8/17.
 */
public class ApiDriver {

    private static final Set<String> DAYS_OF_WEEK_J8 = unmodifiableSet(new HashSet<>(asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")));

    private static final Set<String> DAYS_OF_WEEK_J9 = Set.of("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");

    public static void main(String args[]) {

        System.out.println(String.format("Immutable List of integers before java 9 %s",
                getImmutableListOfIds_before()));

        System.out.println(String.format("Immutable List of integers using the new factory: %s",
                getImmutableListOfIds_java9()));

        System.out.println(String.format("Immutable Set of integers before java 9 %s",
                DAYS_OF_WEEK_J8));

        System.out.println(String.format("Immutable Set of integers using the new factory: %s",
                DAYS_OF_WEEK_J9));
    }


    private static List<Integer> getImmutableListOfIds_before() {
        return Collections.unmodifiableList(asList(1, 2, 3));
    }

    private static List<Integer> getImmutableListOfIds_java9() {
        return List.of(1, 2, 3);
    }
}
