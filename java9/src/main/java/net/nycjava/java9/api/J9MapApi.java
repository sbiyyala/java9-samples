package net.nycjava.java9.api;

import java.util.Map;

public class J9MapApi {

    public static void main(String[] args) {

        Map<Integer, String> idToNames = Map.of(
                1, "Gosling",
                2, "Crockford",
                3, "Odersky",
                4, "Crockford");

        System.out.println(idToNames);
    }
}
