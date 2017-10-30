package jug.pre.lang;

import java.util.Arrays;
import java.util.List;

public class SafeVarargsDemo {

    public static void main(String[] args) {
        SafeVarargsDemo o = new SafeVarargsDemo();
        o.finalVarargsMethod(Arrays.asList("North", "South"),
                Arrays.asList("Up", "Down"));
    }

    @SafeVarargs
    private final void finalVarargsMethod(List<String>... ls) {
        Arrays.stream(ls)
                .forEach(System.out::println);
    }
}
