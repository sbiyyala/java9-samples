package net.nycjava.java8.lang;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public interface J8InterfaceMethods<T extends Comparable> extends List<T> {

    default List<T> smallestN(int limit) {
        return firstN(this, naturalOrder(), limit);
    }

    default List<T> largestN(int limit) {
        return firstN(this, reverseOrder(), limit);
    }

    static <U extends Comparable<U>> List<U> firstN(J8InterfaceMethods<U> instance,
                                                    Comparator<U> comparator,
                                                    int limit) {
        return instance.stream()
                .sorted(comparator)
                .limit(limit)
                .collect(toList());
    }
}
