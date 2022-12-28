package com.example.test;

public class Main {
    public static void main(String[] args) {

        System.out.println(testfunc( 6));
        System.out.println(newtestfunc( 3));
    }
    public static int testfunc(int x) {
        return (x * 2) + 5;

    }
    public static int newtestfunc(int x) {
        return (x * 3) + 5;

    }
}
