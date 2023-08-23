package recursion.Problems.Easy;

import java.util.*;

public class Fibonacci {
    /*
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
     * Fibonacci sequence, such that each number is the sum of the two preceding
     * ones, starting from 0 and 1. That is,
     * 
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     * Given n, calculate F(n).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        System.out.printf("The %d-th term in the fibonacci series is %d.", n, fib(n));
        in.close();
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
