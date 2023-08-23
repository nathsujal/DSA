package recursion.Problems.Easy;

import java.util.Scanner;

public class Product {
    /*
     * Product of 2 Numbers using Recursion
     * 
     * article link:
     * https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
     * 
     * Problem:
     * Given two numbers x and y find the product using recursion.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = in.nextInt();
        System.out.print("n2: ");
        int n2 = in.nextInt();
        int product = multiply(n1, n2);
        System.out.printf("%d x %d = %d.\n", n1, n2, product);
        in.close();
    }

    public static int multiply(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        }
        return multiply(n1, n2 - 1) + n1;
    }
}
