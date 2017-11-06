package net.nycjava.java8.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J8Process {

    // Find all java9 files in current dir
    public static void main(String[] args) throws IOException {
        Process process = new ProcessBuilder("find", ".", "-name", "*.java")
                .start();

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("./java8")) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
        }

        System.out.println(builder.toString());
    }
}
