package recursion.Problems.Easy;

import java.util.Scanner;

public class ReduceToZero {
    /*
     * Number of Steps to Reduce a Number to Zero
     * 
     * Problem link:
     * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
     * 
     * Problem:
     * Given an integer num, return the number of steps to reduce it to zero.
     * 
     * In one step, if the current number is even, you have to divide it by 2,
     * otherwise, you have to subtract 1 from it.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number: ");
        int num = in.nextInt();
        int steps = numberOfSteps(num);
        System.out.printf("No of steps = %d\n", steps);
        in.close();
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int num, int counter) {
        if (num == 0) {
            return counter;
        }
        if (num % 2 == 0) {
            counter++;
            return numberOfSteps(num / 2);
        }
        counter++;
        return numberOfSteps((num - 1));
    }
}
