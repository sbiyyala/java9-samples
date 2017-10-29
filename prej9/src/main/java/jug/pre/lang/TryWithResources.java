package jug.pre.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResources {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new StringReader("Try-With-Resources enhancement"));) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException("IO Exception occurred while reading");
        }
    }
}