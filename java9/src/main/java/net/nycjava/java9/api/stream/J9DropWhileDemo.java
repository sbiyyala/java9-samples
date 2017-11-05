package net.nycjava.java9.api.stream;

import java.util.List;

public class J9DropWhileDemo {

    public static void main(String[] args) {

        List<Integer> maxDailyTempJan2017 = List.of(42, 40, 45, 36, 29, 41, 46, 46, 47, 59, 40, 44, 30, 38, 51,
                52, 42, 31, 28, 37, 36, 30, 27, 35, 39, 48, 47, 42, 41, 39, 56);

        long numberOfDaysAfterTheTemperatureReached50 = maxDailyTempJan2017.stream()
                .dropWhile(temp -> temp < 50)
                .count();

        System.out.println(numberOfDaysAfterTheTemperatureReached50);
    }
}
