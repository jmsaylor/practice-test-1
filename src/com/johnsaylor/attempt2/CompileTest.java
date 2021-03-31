package com.johnsaylor.attempt2;

public class CompileTest {
    public static void main(String[] args) {
        int[] a = {1};
        CompileTest t = new CompileTest();
        t.increment(a);
        System.out.println(a[a.length-1]);
    }

    void increment(int[] i) {
        i[i.length - 1]++;
    }
}
