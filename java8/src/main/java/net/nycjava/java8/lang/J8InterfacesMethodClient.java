package net.nycjava.java8.lang;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Arrays.asList;

public class J8InterfacesMethodClient {

    static class Foo extends ArrayList<Integer> implements J8InterfaceMethods<Integer> {
        public Foo(Collection<Integer> seed) {
            super(seed);
        }
    };

    public static void main(String[] args) {
        Foo foo = new Foo(asList(1, 42, 34, 4, 87, 54, 99, 43, 23, 55, 87, 7));

        // Given a list of ids, give me the smallest 5 distinct ids (ascending-order)
        System.out.println(foo.smallestN(4));

        // Given a list of ids, give me the largest 5 distinct ids (descending-order)
        System.out.println(foo.largestN(3));
    }
}
