package jug.lang;

import java.util.List;
import java.util.function.Predicate;

import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public interface PrivateInterfaceMethodsDemo {

    default List<Integer> smallestByPredicate(List<Integer> ids, Predicate<Integer> predicate, int limit) {
        ids.sort(naturalOrder());
        return compute(ids, predicate, limit);
    }

    default List<Integer> largestByPredicate(List<Integer> ids, Predicate<Integer> predicate, int limit) {
        ids.sort(reverseOrder());
        return compute(ids, predicate, limit);
    }

    private List<Integer> compute(List<Integer> ids, Predicate<Integer> predicate, int limit) {
        return ids.stream()
                .filter(predicate)
                .limit(limit)
                .collect(toList());
    }
}
