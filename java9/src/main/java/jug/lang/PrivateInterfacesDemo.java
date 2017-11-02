package jug.lang;

import java.util.Arrays;
import java.util.List;

public class PrivateInterfacesDemo implements PrivateInterfaceMethodsDemo {

    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(1, 2, 8, 4, 32, 16, 1, 64, 256, 128, 2048, 1024, 5096, 256);

        PrivateInterfacesDemo demo = new PrivateInterfacesDemo();

        // Given a list of ids, give me the smallest 5 distinct ids (ascending-order)
        System.out.println(demo.smallestN(ids, 5));

        // Given a list of ids, give me the largest 5 disctinct ids (descending-order)
        System.out.println(demo.largestN(ids, 5));
    }
}
