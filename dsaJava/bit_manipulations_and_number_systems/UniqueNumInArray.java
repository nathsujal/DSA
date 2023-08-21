package bit_manipulations_and_number_systems;

import java.util.*;

public class UniqueNumInArray {

    /*
     * Given an array of integers, where every number is repeated twice except one
     * number.
     * Find the number which was not repeated (unique number).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int unique = findUnique(arr);
        System.out.printf("Unique element in %s is %d", Arrays.toString(arr), unique);
        in.close();
    }

    public static int findUnique(int[] arr) {
        /*
         * Approach:
         * 
         * a ^ a = 0
         * if we XOR all the elements of the array
         * then as a ^ a = 0, all the elements with same value will be cancelled
         * and only the unique number will left.
         * 
         * you might be thinking while XORing wont the order matter
         * and the answer is NO.
         * i.e., 2 ^ 3 ^ 3 ^ 4 = 2 ^ 4 ^ 3 ^ 3
         * in XOR, the order doesn't matter
         * 
         */
        int unique = 0;
        for (int val : arr) {
            unique ^= val;
        }
        return unique;
    }
}
