package net.nycjava.java9.lang;

import java.util.List;

import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public interface PrivateInterfaceMethodsDemo {

    default List<Integer> smallestN(List<Integer> ids, int limit) {
        ids.sort(naturalOrder());
        return compute(ids, limit);
    }

    default List<Integer> largestN(List<Integer> ids, int limit) {
        ids.sort(reverseOrder());
        return compute(ids, limit);
    }

    private List<Integer> compute(List<Integer> ids, int limit) {
        return ids.stream()
                .distinct()
                .limit(limit)
                .collect(toList());
    }
}
