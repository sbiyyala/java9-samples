package net.nycjava.java9.lang;

public class J9UnderscoreDemo {

    public static void main(String[] args) {
        // underscore will possibly be used for function parameters you don't care about
        // [throwaway param, like in javascript]

        // int _ = 10; (fails!)
        int ten = 10;
        System.out.println(ten);
    }
}
