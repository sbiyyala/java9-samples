package net.nycjava.java8.lang;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public interface J8InterfaceMethodsDemo<T extends Comparable> extends List<T> {

    default List<Integer> smallestN(int limit) {
        return firstN(this, naturalOrder(), limit);
    }

    default List<Integer> largestN(int limit) {
        return firstN(this, reverseOrder(), limit);
    }

    static <U extends Comparable<U>> List<U> firstN(J8InterfaceMethodsDemo<U> instance,
                                                    Comparator<U> comparator,
                                                    int limit) {
        return instance.stream()
                .sorted(comparator)
                .limit(limit)
                .collect(toList());
    }
}
