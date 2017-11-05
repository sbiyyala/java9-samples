package net.nycjava.java8.api;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableMap;
import static java.util.stream.Collectors.toList;

public class J8OptionalApi {


    public static void main(String[] args) {

        Stream<SimpleEntry<String, List<Integer>>> studentsGradeStream = Stream.of(
                new SimpleEntry<>("Jane", asList(50, 75, 99)),
                new SimpleEntry<>("Kumar", asList(75, 61, 100)),
                new SimpleEntry<>("John", asList()),
                new SimpleEntry<>("Bob", asList(76, 76, 49)),
                new SimpleEntry<>("Xu", asList()));

        Map<String, List<Integer>> semGradesOfStudents = unmodifiableMap(studentsGradeStream
                .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue)));

        // Least of each student
        List<Integer> lowestGradesOfStudents = semGradesOfStudents.entrySet()
                .stream()
                .map(entry -> entry.getValue()
                        .stream()
                        .min(Integer::compareTo))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(toList());

        System.out.println(lowestGradesOfStudents);
    }
}
