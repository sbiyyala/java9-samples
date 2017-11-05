package net.nycjava.java8.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class J8TryWithResourcesDemo {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new StringReader("Try-With-Resources enhancement. " +
                "Should be effectively final"));
        try(BufferedReader finalReader = reader) {
            System.out.println(finalReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException("IO Exception occurred while reading");
        }
    }
}