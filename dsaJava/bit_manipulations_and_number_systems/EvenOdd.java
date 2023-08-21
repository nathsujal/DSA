package bit_manipulations_and_number_systems;

import java.util.*;

public class EvenOdd {
    /*
     * A number is given, find whether it is odd or even.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean even = isEven(n);
        if (even == true) {
            System.out.printf("\n%d is even.\n", n);
        } else {
            System.out.printf("\n%d is odd.\n", n);
        }
        in.close();
    }

    public static boolean isEven(int num) {
        /*
         * Approach:
         * 
         * the 2^0 position of any binary number
         * tells us whether the number is even or odd
         * and any number, n & 1 = n
         * if, n & 1 == 1 => n is even
         * and if, n & 1 == 0 => n is odd
         * 
         */
        return (num & 1) == 0;
    }
}
