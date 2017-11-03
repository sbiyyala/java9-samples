package net.nycjava.java9.api;

import java.util.Map;

public class J9MapApi {

    private static final Map<Integer, String> idToNames = Map.of(
            1, "Gosling",
            2, "Crockford",
            3, "Odersky",
            4, "Crockford");

    public static void main(String[] args) {
        idToNames.put(5, "new integer");
        System.out.println(idToNames);
    }
}
