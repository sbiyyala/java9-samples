package net.nycjava.java9.lang;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public interface J9InterfaceMethodsDemo<T extends Comparable<T>> extends List<T> {

    default List<T> smallestN(int limit) {
        return firstN(naturalOrder(), limit);
    }

    default List<T> largestN(int limit) {
        return firstN(reverseOrder(), limit);
    }

    private List<T> firstN(Comparator<T> comparator, int limit) {
        return stream()
                .sorted(comparator)
                .limit(limit)
                .collect(toList());
    }
}
