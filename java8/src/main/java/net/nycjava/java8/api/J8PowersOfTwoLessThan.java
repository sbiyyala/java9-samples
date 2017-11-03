package net.nycjava.java8.api;

public class J8PowersOfTwoLessThan {

    // Print powers of 2 <= 1000000
    public static void main(String[] args) {

        for (int i = 1; i <= 1000000; i++) {
            if ((i & (i-1)) == 0) {
                System.out.println(i);
            }
        }
    }
}
