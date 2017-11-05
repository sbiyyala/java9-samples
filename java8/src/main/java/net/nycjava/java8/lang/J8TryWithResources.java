package net.nycjava.java8.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class J8TryWithResources {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new StringReader("hello NYC Java"));

        try(BufferedReader finalReader = reader) {
            System.out.println(finalReader.readLine());
        }
    }
}