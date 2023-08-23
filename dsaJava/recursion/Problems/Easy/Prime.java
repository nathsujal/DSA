package recursion.Problems.Easy;

import java.util.Scanner;

public class Prime {
    /*
     * Recursive program for prime number
     * 
     * article link:
     * https://www.geeksforgeeks.org/recursive-program-prime-number/
     * 
     * Problem link:
     * https://practice.geeksforgeeks.org/problems/prime-number2314/1
     * 
     * Problem:
     * Given a number n, check whether it’s prime number or not using recursion.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.printf("%d is not a prime no.\n", n);
        } else {
            System.out.printf("%d is a prime no.\n", n);
        }
        in.close();
    }

    public static boolean isPrime(int n) {
        return helper(n, 2);
    }

    public static boolean helper(int n, int div) {
        if (div > Math.sqrt(n)) {
            // the number is not a prime
            // as the program reached to this level
            return false;
        }
        if (n % div == 0) {
            // if the number is divisible by any number
            // between 2 and sqrt(n) => then it is not a prime
            return true;
        }
        // passing the number for further check
        return helper(n, div + 1);
    }
}
