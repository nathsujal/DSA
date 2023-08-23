package recursion.Problems.Easy;

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
        boolean isPowerOf2 = isPowerOfTwo(n);
        System.out.println(isPowerOf2);
        in.close();
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else if (n != 1 && n % 2 != 0) {
            // any no having a odd no as a multiple except 1
            // can never be a power of 2
            return false;
        } else if (n == 1) {
            return true;
        }
        return isPowerOfTwo(n / 2);
    }
}
