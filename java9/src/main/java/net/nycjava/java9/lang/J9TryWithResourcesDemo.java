package net.nycjava.java9.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class J9TryWithResourcesDemo {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new StringReader("Try-With-Resources enhancement. " +
                "Should be effectively final"));
        // reader = new BufferedReader(new StringReader("Reassigning fails!"));
        try(reader) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException("IO Exception occurred while reading");
        }
    }
}
