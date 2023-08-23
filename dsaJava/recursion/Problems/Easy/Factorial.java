package recursion.Problems.Easy;

import java.util.Scanner;

public class Factorial {
    /*
     * Factorial of a Number using recursion
     * 
     * Problem link:
     * https://www.hackerrank.com/challenges/30-recursion/problem
     * 
     * Problem:
     * Find the factorial of a number
     * factorial(n) = 1 , if n <= 1
     * factorial(n) = n*(n-1)*(n-2)*...*2*1 = factorial(n-1) * n
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int fact = factorial(n);
        System.out.printf("%d! = %d\n", n, fact);
        in.close();
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
