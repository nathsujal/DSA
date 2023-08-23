package recursion.Problems.Easy;

import java.util.Scanner;

public class NnaturalNumber {
    /*
     * Sum of natural numbers using recursion
     * 
     * article link:
     * https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
     * 
     * Problem:
     * Given a number n, find sum of first n natural numbers.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int sum = sumOfN(n);
        System.out.printf("sum of first %d natural nos. = %d.\n", n, sum);
        in.close();
    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }
}
