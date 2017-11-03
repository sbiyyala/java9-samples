package net.nycjava.java9.api;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class J9OptionalApi {

    private static Map<Integer, String> idToName = Map.of(
            1, "James Gosling",
            2, "Joshua Bloch",
            3, "Brian Goetz");

    public static void main(String[] args) {

        List<Integer> ids = List.of(1, 2, 3, 4, 5);
        System.out.println("======= J9 =======");
        System.out.println(getStudentNames(ids));
    }

    private static List<String> getStudentNames(Collection<Integer> ids) {

        return ids.stream()
                .map(J9OptionalApi::getStudentById)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

    private static Optional<String> getStudentById(Integer id) {
        return Optional.ofNullable(idToName.get(id));
    }
}
