package bit_manipulations_and_number_systems;

import java.util.Scanner;

public class ResetIthBit {
    /*
     * given a number, set its i-th as 0
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter i: ");
        int i = in.nextInt();
        int new_n = ithBit(n, i);
        System.out.printf("After re-setting the %d-th term of %d.\nThe new number is %d.\n", i, n, new_n);
        in.close();
    }

    public static int ithBit(int num, int i) {
        /*
         * any bit & 0 = 0
         * and any bit & 1 = the bit itself
         * 
         * as we want to make the i-th bit as 0
         * we will (ith-bit & 0)
         * but we want the rest of the bits
         * so we will (& 1) with rest of the bits
         * 
         * we will complement the left shift of 1 by (i - 1)
         * the complement will make the ith bit as 0 and rest of the bits as 1
         * 
         */

        int new_num = (num & ~(1 << (i - 1)));
        return new_num;
    }

    public static int pow(int num, int p) {
        if (p == 1) {
            return 1;
        }
        return num * pow(num, p - 1);
    }
}
