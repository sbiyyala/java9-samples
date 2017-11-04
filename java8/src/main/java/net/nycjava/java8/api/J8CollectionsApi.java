package net.nycjava.java8.api;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static java.util.Collections.unmodifiableSet;

public class J8CollectionsApi {
    public static void main(String args[]) {

        // list
        System.out.println(
                unmodifiableList(asList(1, 2, 3))
        );
        // set
        System.out.println(
                unmodifiableSet(new HashSet<>(asList(
                        "MON", "TUE", "WED",
                        "THU", "FRI", "SAT", "SUN"))
        ));
    }
}
