package recursion.Problems.Easy;

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
        boolean isPowerOf2 = isPowerOfThree(n);
        System.out.println(isPowerOf2);
        in.close();
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        } else if (n != 1 && n % 3 != 0) {
            // any no having a even no as a multiple
            // can never be a power of 3
            return false;
        } else if (n == 1) {
            return true;
        }
        return isPowerOfThree(n / 3);
    }
}
