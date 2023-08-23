package recursion.Problems.Easy;

import java.util.*;

public class Geek_onacciNumber {
    /*
     * Geek-onacci Number
     * 
     * Problem link:
     * https://practice.geeksforgeeks.org/problems/geek-onacci-number/0/
     * 
     * Problem:
     * Geek created a random series and given a name geek-onacci series. Given four
     * integers A, B, C, N. A, B, C represents the first three numbers of
     * geek-onacci series. Find the Nth number of the series. The nth number of
     * geek-onacci series is a sum of the last three numbers (summation of N-1th,
     * N-2th, and N-3th geek-onacci numbers)
     * 
     * Input:
     * 1. The first line of the input contains a single integer T denoting the
     * number of test cases. The description of T test cases follows.
     * 2. The first line of each test case contains four space-separated integers A,
     * B, C, and N.
     * 
     * Output: For each test case, print Nth geek-onacci number
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int n = in.nextInt();
            System.out.print("Geek-onacci Number: ");
            System.out.println(geek_onacciNumber(a, b, c, n));
        }
        in.close();
    }

    public static int geek_onacciNumber(int a, int b, int c, int n) {
        if (n == 1) {
            return a;
        } else if (n == 2) {
            return b;
        } else if (n == 3) {
            return c;
        }
        return geek_onacciNumber(a, b, c, n - 1) + geek_onacciNumber(a, b, c, n - 2)
                + geek_onacciNumber(a, b, c, n - 3);
    }

}
