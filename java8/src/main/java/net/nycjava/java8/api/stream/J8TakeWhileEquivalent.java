package net.nycjava.java8.api.stream;

import java.util.List;

import static java.util.Arrays.asList;

public class J8TakeWhileEquivalent {

    public static void main(String[] args) {
        List<Integer> maxDailyTempJan2017 = asList(42, 40, 45, 36, 29, 41, 46, 46, 47, 59, 40, 44, 30, 38, 51,
                52, 42, 31, 28, 37, 36, 30, 27, 35, 39, 48, 47, 42, 41, 39, 56);

        int numberOfDaysBeforeTheTemperatureReached50 = 0;
        while (maxDailyTempJan2017.get(numberOfDaysBeforeTheTemperatureReached50) < 50) {
            numberOfDaysBeforeTheTemperatureReached50++;
        }

        System.out.println(numberOfDaysBeforeTheTemperatureReached50);
    }
}
