package recursion.Problems.Easy;

import java.util.Scanner;

public class SpecialFibonacci {
    /*
     * Special Fibonacci
     * 
     * Problem link:
     * https://www.codechef.com/problems/FIBXOR01/
     * 
     * Problem:
     * Sankalp recently learned Fibonacci numbers and now he is studying different
     * algorithms to find them. After getting bored of reading them, he came with
     * his own new type of numbers. He defined them as follows:
     * 
     * f(0) = a;
     * f(1) = b;
     * f(n) = f(n-1) ^ f(n-2); when n>1, where ^ denotes the bitwise xor operation.
     * You are given three integers a,b and n , calculate f(n).
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        System.out.printf("The %d-th term in the fibonacci series is %d.", n, specialFib(a, b, n));
        in.close();
    }

    public static int specialFib(int a, int b, int n) {
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        }
        return specialFib(a, b, n - 1) ^ specialFib(a, b, n - 2);
    }
}
