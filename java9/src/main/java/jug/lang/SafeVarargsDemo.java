package jug.lang;

import java.util.Arrays;
import java.util.List;

public class SafeVarargsDemo {

    // SafeVarargs must be used with methods that cannot be overridden
    public static void main(String[] args) {

        SafeVarargsDemo o = new SafeVarargsDemo();
        o.privateVarargsMethod(Arrays.asList("North", "South"),
                Arrays.asList("Up", "Down"));
    }

    @SafeVarargs
    private void privateVarargsMethod(List<String>... ls) {
        Arrays.stream(ls)
                .forEach(System.out::println);
    }
}
