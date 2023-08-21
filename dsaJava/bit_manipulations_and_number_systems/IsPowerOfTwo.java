package bit_manipulations_and_number_systems;

import java.util.*;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean isPowerOf2 = isPowerOf2(num);
        if (isPowerOf2) {
            System.out.printf("%d is a power of 2.\n", num);
        } else {
            System.out.printf("%d is not a power of 2.\n", num);
        }

        System.out.println("Using Approach 2");
        boolean isPowerOf2_appraoch2 = isPowerOf2_approach2(num);
        if (isPowerOf2_appraoch2) {
            System.out.printf("%d is a power of 2.\n", num);
        } else {
            System.out.printf("%d is not a power of 2.\n", num);
        }
        in.close();
    }

    public static boolean isPowerOf2(int num) {
        int count1 = 0;
        int i = 0;
        while (num != 0) {
            // taking the current last bit
            int lastBit = num & 1;
            if (i == 0 & lastBit == 1) {
                // if the 2^0 position has 1
                // then the no is odd
                // so it can't be a power of 2
                return false;
            } else if (lastBit == 1) {
                count1++;
            }
            // removing the current last bit
            num = num >> 1;
            i++;
        }
        // if the binary form of the number contains
        // even no of 1 => not a power of 2
        // odd no of 1 => a power of 2
        if (count1 % 2 == 0) {
            return false;
        }
        return true;
    }

    public static boolean isPowerOf2_approach2(int num) {
        if ((num & (num - 1)) == 0) {
            // num is a power of 2
            return true;
        }
        // else
        return false;
    }
}
