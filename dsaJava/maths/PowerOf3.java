package maths;

import java.util.Scanner;

public class PowerOf3 {
    /*
     * Power of Three
     * 
     * Problem link:
     * https://leetcode.com/problems/power-of-three/
     * 
     * Problem:
     * Given an integer n, return true if it is a power of three. Otherwise, return
     * false.
     * An integer n is a power of three, if there exists an integer x such that n ==
     * 3x.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        boolean isPowerOf2 = bit_isPowerOfThree(n);
        System.out.println(isPowerOf2);
        in.close();
    }

    public static boolean isPowerOfThree(int n) {
        if (n != 1 && n % 3 != 0) {
            // any no having a even no as a multiple
            // can never be a power of 3
            return false;
        }
        if (n == 1) {
            return true;
        }
        return isPowerOfThree(n / 3);
    }

    public static boolean math_isPowerOfThree(int n) {
        double p = Math.log10(n) / Math.log10(3);
        if (Math.round(p) / 1.0 == p) {
            return true;
        }
        return false;
    }

    public static boolean bit_isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        int count1 = 0;
        while (n > 0) {
            // extracting the last bit
            int lastBit = n & 1;
            // eliminating the last bit
            n = n >> 1;
            if (lastBit != 0) {
                count1++;
            }
        }
        System.out.println(count1);
        if (count1 >= 1 & count1 % 2 == 0) {
            return true;
        }
        return false;
    }
}
