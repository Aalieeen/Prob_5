package com.company;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        long w1 = 600851475143L;
        long w2 = 1;
        while (w1 > 1) {
            w2++;
            if ( neverMind (w2) == true) {
                while (w1 % w2 == 0) {
                    w1 /= w2;
                }
            }
        }
        System.out.println(w2);
    }
    public static boolean neverMind(long x) {
        for (int num = 2; num <= Math.sqrt(x); num++) {
            if (x % num == 0) {
                return false;
            }
        }
        return true;
    }
}






