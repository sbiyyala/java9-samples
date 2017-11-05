package net.nycjava.java8.lang;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class J8AnonDiamondDemo {

    public static void main(String[] args) {
        // Using diamond with anon inner classes not supported, doing so would require extensions
        // to the class file signature attribute to represent non-denotable types
        // Compiler-internal types which cannot be written in a Java Program are called non-denotable types
        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        Iterator<String> iterator = new Iterator<String>() {
            int idx = 0;

            @Override
            public boolean hasNext() {
                return idx < daysOfWeek.length;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return daysOfWeek[idx++];
            }
        };

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

