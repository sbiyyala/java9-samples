package jug.api;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalApiDriver {

    private static Map<Integer, String> idToName = Map.of(
            1, "James Gosling",
            2, "Joshua Bloch",
            3, "Brian Goetz");

    public static void main(String[] args) {

        List<Integer> ids = List.of(1, 2, 3, 4, 5);
        System.out.println("======= J8 =======");
        System.out.println(getStudentNames_J8(ids));
        System.out.println("======= J9 =======");
        System.out.println(getStudentNames_J9(ids));
    }

    private static List<String> getStudentNames_J8(Collection<Integer> ids) {

        return ids.stream()
                .map(OptionalApiDriver::getStudentById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    private static List<String> getStudentNames_J9(Collection<Integer> ids) {

        return ids.stream()
                .map(OptionalApiDriver::getStudentById)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

    private static Optional<String> getStudentById(Integer id) {
        return Optional.ofNullable(idToName.get(id));
    }
}
