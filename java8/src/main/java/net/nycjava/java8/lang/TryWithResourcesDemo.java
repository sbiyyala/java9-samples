package net.nycjava.java8.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        // todo: research more into this
        BufferedReader reader = new BufferedReader(new StringReader("Try-With-Resources enhancement. " +
                "Should be effectively final"));
        try(BufferedReader finalReader = reader) {
            System.out.println(finalReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException("IO Exception occurred while reading");
        }
    }
}