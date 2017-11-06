package net.nycjava.java9.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class J9Process {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Print all java 9 files. find ~/ to see timeout in play
        List<Process> processes = ProcessBuilder.startPipeline(
                asList(
                        new ProcessBuilder("find", "."),
                        new ProcessBuilder("grep", "-E", ".*\\.java")));

        Process finalProcess = processes.get(1);

        finalProcess.onExit()
                .orTimeout(100, MILLISECONDS)
                .thenAccept(p -> new BufferedReader(new InputStreamReader(p.getInputStream()))
                        .lines()
                        .filter(l -> l.startsWith("./java9"))
                        .forEach(System.out::println));

        System.out.println(format("CPU: %d ms",
                ProcessHandle.current().info()
                        .totalCpuDuration()
                        .map(Duration::toMillis)
                        .orElse(0L)));
    }
}
