package maths;

import java.util.Scanner;

public class Pow {
    /*
     * Pow(x, n)
     * 
     * Problem link:
     * https://leetcode.com/problems/powx-n/description/
     * 
     * Problem:
     * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     * 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        double x = in.nextDouble();
        System.out.print("n: ");
        int n = in.nextInt();
        double pow = myPow(x, n);
        System.out.println(pow);
        in.close();
    }

    // the approach also works with very big decimal values

    public static double myPow(double x, int n) {
        if (n < 0) {
            return 1 / pow(x, n);
        }
        return pow(x, n);
    }

    private static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        /*
         * if n is even
         * power = pow(x, n/2) * pow(x, n/2)
         * 
         * if n is odd
         * power = x * pow(x, n/2) * pow(x, n/2)
         * 
         * Note:
         * Don't call pow(x, n/2) twice -> store its value in one variable
         * and use it when required. As calling it twice may raise StackOverFlowError
         * in case of big numbers.
         */

        double res = pow(x, n / 2);
        if (n % 2 == 0) {
            return res * res;
        }
        return res * res * x;
    }
}
