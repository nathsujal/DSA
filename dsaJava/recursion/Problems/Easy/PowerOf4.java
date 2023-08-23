package recursion.Problems.Easy;

import java.util.Scanner;

public class PowerOf4 {
    /*
     * Power of Four
     * 
     * Problem link:
     * https://leetcode.com/problems/power-of-four/
     * 
     * Problem:
     * Given an integer n, return true if it is a power of four. Otherwise, return
     * false.
     * An integer n is a power of four, if there exists an integer x such that n ==
     * 4x.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        boolean isPowerOf2 = recur_isPowerOfFour(n);
        System.out.println(isPowerOf2);
        in.close();
    }

    public static boolean recur_isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        } else if (n != 1 && n % 4 != 0) {
            // any no having a odd no as a multiple except 1
            // can never be a power of 2
            return false;
        } else if (n == 1) {
            return true;
        }
        return recur_isPowerOfFour(n / 4);
    }
}
