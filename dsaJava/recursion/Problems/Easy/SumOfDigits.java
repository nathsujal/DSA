package recursion.Problems.Easy;

import java.util.Scanner;

public class SumOfDigits {
    /*
     * Sum of digit of a number using recursion
     * 
     * article link:
     * https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
     * 
     * Problem link:
     * https://practice.geeksforgeeks.org/problems/sum-of-digits1742/1
     * 
     * Problem:
     * Given a number, N. Find the sum of all the digits of N
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int num = in.nextInt();
        int sumOfDigits = sumDigits(num);
        System.out.printf("Sum of digits of %d is: %d.\n", num, sumOfDigits);
        in.close();
    }

    public static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }

        return sumDigits(num / 10) + num % 10;
    }
}
