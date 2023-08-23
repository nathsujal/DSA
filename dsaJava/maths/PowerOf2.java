package maths;

import java.util.Scanner;

public class PowerOf2 {
    /*
     * Power of Two
     * 
     * Problem link:
     * https://leetcode.com/problems/power-of-two/
     * 
     * Problem:
     * Given an integer n, return true if it is a power of two. Otherwise, return
     * false.
     * 
     * An integer n is a power of two, if there exists an integer x such that n ==
     * 2x.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        boolean isPowerOf2 = bit2_isPowerOfTwo(n);
        System.out.println(isPowerOf2);
        in.close();
    }

    public static boolean isPowerOfTwo(int n) {
        if (n != 1 && n % 2 != 0) {
            // any no having a odd no as a multiple except 1
            // can never be a power of 2
            return false;
        }
        if (n == 1) {
            return true;
        }
        return isPowerOfTwo(n / 2);
    }

    public static boolean math_isPowerOfTwo(int n) {
        double p = Math.log10(n) / Math.log10(2);
        // if p = 1.5 => p * 10 = 1.5 * 10 = 15
        // and, (int) p * 10 = 1 * 10 = 10
        // thus we can check if p is a natural no or not
        // and if p is a natural no => then n is power of 2
        if (Math.round(p) * 1.0 == p) {
            return true;
        }
        return false;
    }

    public static boolean bit_isPowerOfTwo(int n) {
        // if (n & (n - 1)) == 0 -> n is a power of 2
        // and if (n & (n - 1)) == 1 -> n is not a power of 2
        if (n > 0 & (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static boolean bit2_isPowerOfTwo(int n) {
        int count1 = 0;
        while (n > 0) {
            int lastBit = n & 1;
            n = n >> 1;
            if (lastBit != 0) {
                count1++;
            }
        }
        if (count1 % 2 == 1) {
            // if the binary value of no. contains
            // odd no of 1 bits then it is a power of 2
            return true;
        }
        // else it is not a power of 2
        return false;
    }
}
