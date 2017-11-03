package net.nycjava.java9.api.stream;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class J9TakeWhileDemo {

    public static void main(String[] args) {
        List<Integer> ids = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println(
                ids.stream()
                        .takeWhile(x -> x < 5)
                        .collect(toList())
        );


        // SB: in your example the values are moving in a single direction (ascending), which means that filter()
        // works just as well as a takeWhile()
        // instead, consider a data set that has no single direction, e.g., daily temperatures

        List<Integer> maxDailyTempJan2016 = List.of(42, 40, 45, 36, 29, 41, 46, 46, 47, 59, 40, 44, 30, 38, 51,
                52, 42, 31, 28, 37, 36, 30, 27, 35, 39, 48, 47, 42, 41, 39, 56);

        // java 8

        {
            int numberOfDaysBeforeTheTemperatureReached50 = 0;
            while (maxDailyTempJan2016.get(numberOfDaysBeforeTheTemperatureReached50) < 50) {
                numberOfDaysBeforeTheTemperatureReached50++;
            }

            System.out.println(numberOfDaysBeforeTheTemperatureReached50);
        }

        // java 9

        {
            long numberOfDaysBeforeTheTemperatureReached50 = maxDailyTempJan2016.stream()
                    .takeWhile(temp -> temp < 50)
                    .count();

            System.out.println(numberOfDaysBeforeTheTemperatureReached50);
        }

        // feel free to use this example, or make up another
    }
}