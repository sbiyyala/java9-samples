package net.nycjava.java9.api;

import java.util.*;

public class J9CollectionsApi {

    public static void main(String args[]) {
        List<Integer> immutableListOfNumbers = List.of(1, 2, 3);

        System.out.println(immutableListOfNumbers);

        Set<String> names = Set.of("John", "Mary", "Laxmi", "Xin");

        System.out.println(names);
    }
}