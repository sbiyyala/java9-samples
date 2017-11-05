package net.nycjava.java9.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class J9TryWithResourcesDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new StringReader("hello NYC Java"));

        // reader = new BufferedReader(new StringReader("Reassigning breaks!"));

        try(reader) {
            System.out.println(reader.readLine());
        }
    }
}
