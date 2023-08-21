package bit_manipulations_and_number_systems;

import java.util.*;

public class PascalTriangle {
    /*
     * Find the sum of n-th row in Pascal's triangle
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = sumOfNthRow(n);
        System.out.printf("Sum of %d-th row in Pascal Triangle is %d.\n", n, sum);
        in.close();
    }

    public static int sumOfNthRow(int n) {
        /*
         * In a Pascal's Triangle
         * sum of each row = 2^n
         * and sum of n-th row = 2^(n-1)
         * Using Bitwise manipulation
         * sum of n-th row = 1 << (n - 1)
         */
        return 1 << (n - 1);
    }
}
