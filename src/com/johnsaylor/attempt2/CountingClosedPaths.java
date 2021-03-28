package com.johnsaylor.attempt2;

public class CountingClosedPaths {
    public static void test(){
        System.out.println(countingClosedPaths(649578));
    }

    static int countingClosedPaths(int n){
        String numString = String.valueOf(n);
        int result = 0;
        for (char temp : numString.toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(temp));
            if (digit == 6 || digit == 4 || digit == 9 || digit == 0) {
                result+=1;
            } else if (digit == 8) {
                result+=2;
            }
        }
        return result;
    }

}
