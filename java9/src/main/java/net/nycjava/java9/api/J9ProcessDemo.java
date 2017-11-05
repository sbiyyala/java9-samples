package net.nycjava.java9.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Thread.sleep;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class J9ProcessDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = new ProcessBuilder("ls", "-alR")
                .start();
        process.onExit()
                .orTimeout(1000, MILLISECONDS)
                .thenAccept(p -> new BufferedReader(new InputStreamReader(p.getInputStream()))
                        .lines()
                        .filter(s -> s.startsWith("total"))
                        .forEach(System.out::println));
        process.waitFor();
        sleep(100);
        System.out.println("Done");
    }
}
