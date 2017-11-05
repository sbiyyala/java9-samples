package net.nycjava.java9.api;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class J9OptionalApi {

    public static void main(String[] args) {

        Map<String, List<Integer>> semGradesOfStudents = Map.of(
                "Jane", List.of(50, 75, 99),
                "Kumar", List.of(75, 61, 100),
                "John", List.of(),
                "Bob", List.of(76, 76, 49),
                "Xu", List.of()
        );

        // Least of each student
        List<Integer> lowestGradesOfStudents = semGradesOfStudents.entrySet()
                .stream()
                .map(entry -> entry.getValue()
                        .stream()
                        .min(Integer::compareTo))
                .flatMap(Optional::stream)
                .collect(Collectors.toList());

        System.out.println(lowestGradesOfStudents);
    }
}
