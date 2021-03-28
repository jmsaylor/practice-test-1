package com.johnsaylor.attempt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    public static void test() {
        isValidEmail("judia_123@hackerrank.com");
    }

    static void isValidEmail(String email) {
        Pattern pattern = Pattern.compile("[a-z]{1,6}_?[0-9]{0,4}@hackerrank.com");

        System.out.println(pattern.matcher(email).matches());


    }
}
