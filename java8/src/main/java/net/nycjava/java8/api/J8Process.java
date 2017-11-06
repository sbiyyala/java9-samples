package net.nycjava.java8.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J8Process {

    // Find all java8 files in current dir
    public static void main(String[] args) throws IOException {
        Process process = new ProcessBuilder("find", ".", "-name", "*.java")
                .start();

        new BufferedReader(new InputStreamReader(process.getInputStream()))
                .lines()
                .filter(l -> l.startsWith("./java8"))
                .forEach(System.out::println);
    }
}
