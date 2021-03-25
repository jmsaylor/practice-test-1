package com.johnsaylor;

import java.util.regex.Pattern;

public class ValidEmail {
    public static void test(){
        validEmail(new String[]{"john1234@hackerrank.com"});
    }

    static void validEmail(String[] emails){

        Pattern regex = Pattern.compile("^[a-z]{1,6}_?[0-9]{0,4}@hackerrank.com$");

        for(String email : emails){
            System.out.println(regex.matcher(email).matches());
        }
    }
}
