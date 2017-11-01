package jug.lang;

import java.util.Arrays;
import java.util.List;

public class PrivateInterfacesDemo implements PrivateInterfaceMethodsDemo {

    public static void main(String[] args) {

        List<Integer>  ids = Arrays.asList(10, 20, 30, 5, 3, 2, 1, 100, 200, 600,
                45, 1024, 512, 256);

        PrivateInterfacesDemo demo = new PrivateInterfacesDemo();

        // Given a list of ids, give me the smallest 5 ids (ascending-order) greater than 10
        System.out.println(demo.smallestByPredicate(ids, id -> id > 10, 5));

        // Given a list of ids, give me the largest 5 ids (descending-order) less than 500
        System.out.println(demo.largestByPredicate(ids, id -> id < 500, 5));
    }
}
