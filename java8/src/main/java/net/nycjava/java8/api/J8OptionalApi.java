package net.nycjava.java8.api;

import java.util.*;
import java.util.stream.Collectors;

public class J8OptionalApi {

    private static Map<Integer, String> idToName = new HashMap<>();

    static {
        idToName.put(1, "James Gosling");
        idToName.put(2, "Joshua Bloch");
        idToName.put(3, "Brian Goetz");
    }

    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("======= J8 =======");
        System.out.println(getStudentNames(ids));
    }

    private static List<String> getStudentNames(Collection<Integer> ids) {

        return ids.stream()
                .map(J8OptionalApi::getStudentById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    private static Optional<String> getStudentById(Integer id) {
        return Optional.ofNullable(idToName.get(id));
    }
}
