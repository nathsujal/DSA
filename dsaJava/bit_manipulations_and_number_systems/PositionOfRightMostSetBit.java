package bit_manipulations_and_number_systems;

import java.util.Scanner;

public class PositionOfRightMostSetBit {
    /*
     * given a number, find the position of its right most set bit (bit having 1)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int pst = rightMostSetBit(n);
        System.out.printf("%d in binary is: %s.\n", n, Integer.toBinaryString(n));
        System.out.printf("Position of right most set bit in %d is : %d", n, pst);
        in.close();
    }

    public static int rightMostSetBit(int num) {
        /*
         * num = a1b
         * -num = (~a)1b
         * where a and b are bits
         * and 1 is the right most set bit in the number
         * 
         * right most set bit, formula: num & (-num)
         * the above formula will give the ans in decimal form
         * to get the position of the right most set bit
         * formula: (num & (-num))
         */
        int rightMostSetBit_in_dec = num & (-num);
        int i = 1; // 1-index
        while (rightMostSetBit_in_dec > 0) {
            /*
             * using dec - bin converted
             * where remainder becomes 1 => the loop will break
             * and we will get our right most set bit
             * (right most bit with 1)
             */
            int binary = rightMostSetBit_in_dec % 2;
            rightMostSetBit_in_dec = rightMostSetBit_in_dec / 2;
            if (binary == 1) {
                break;
            }
            i++;
        }

        // returning the position of right most set bit
        return i;
    }
}
