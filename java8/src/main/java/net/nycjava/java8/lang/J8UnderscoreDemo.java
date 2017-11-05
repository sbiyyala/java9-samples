package net.nycjava.java8.lang;

import java.util.function.Consumer;

public class J8UnderscoreDemo {

    public static void main(String[] args) {

        int _ = 10;
        System.out.println(_ * 10);

        Consumer<String> out = s -> System.out.println(s);
        out.accept("hello");

//        Consumer<String> err = _ -> System.out.println(_);
//        err.accept("world");
    }
}
