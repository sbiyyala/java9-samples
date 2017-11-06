package net.nycjava.java9.api;

import java.util.List;

public class J9TakeWhile {

    public static void main(String[] args) {

        List<Integer> maxDailyTempJan2017 = List.of(42, 40, 45, 36, 29, 41, 46, 46, 47, 59, 40, 44, 30, 38, 51,
                52, 42, 31, 28, 37, 36, 30, 27, 35, 39, 48, 47, 42, 41, 39, 56);

        long numberOfDaysBeforeTheTemperatureReached50 = maxDailyTempJan2017.stream()
                .takeWhile(temp -> temp < 50)
                .count();

        System.out.println("Number of Days Before Temperature Reached 50 in Jan : " +
                numberOfDaysBeforeTheTemperatureReached50);
    }
}