package com.johnsaylor;

public class LastAndSecondLast {

    public static void test() {
        lastAndSecondLast("APPLE");
    }

    public static void lastAndSecondLast(String input) {
        char last = input.charAt(input.length() - 1);
        char secondLast = input.charAt(input.length() - 2);
        System.out.println(last + " " + secondLast);
    }

}
