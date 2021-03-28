package com.johnsaylor.attempt2;

public class FizzBuzz {
    static public void test() {
        fizzBuzz(10);
    }

    static void fizzBuzz(int n){
        int length = n;
        for (n = 1; n <= length; n++) {
            String result = "";
            if (n % 5 == 0 && n % 3 == 0) {
                result = "FizzBuzz";
            } else if (n % 5 == 0) {
                result = "Buzz";
            } else if (n % 3 == 0) {
                result = "Fizz";
            } else {
                result = String.valueOf(n);
            }

            System.out.println(result);
        }
    }
}
