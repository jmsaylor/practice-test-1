package com.johnsaylor.attempt2;

public class TwoLastCharacters {
    public static void test() {
        System.out.println(twoLastCharacters("APPLE"));
    }

    static String twoLastCharacters(String input) {
        return input.charAt(input.length() - 1) + " " + input.charAt(input.length() - 2);
    }
}
