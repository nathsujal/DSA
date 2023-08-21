package bit_manipulations_and_number_systems;

import java.util.*;

public class IthBit {
    /*
     * given a decimal number, find the ith bit in its binary form.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter i: ");
        int i = in.nextInt();
        int ith_bit = ithBit(n, i);
        System.out.printf("%d-th bit of %d is %d.\n", i, n, ith_bit);
        in.close();
    }

    public static int ithBit(int num, int i) {
        /*
         * any bit & 1 = the bit itself
         * and to reach the ith bit of num
         * we left shilf 1 by (i - 1)
         * So, the i-th bit = num & (1 << (i - 1))
         * 
         * the formula gives the decimal value of the bit at the specified position
         * to find the bit (i.e., 0 or 1) divide the above formula by pow(2, i-1)
         */
        int ith_bit_in_dec = (num & (1 << (i - 1)));
        int ith_bit_in_bin = ith_bit_in_dec / pow(2, (i - 1));
        return ith_bit_in_bin;
    }

    public static int pow(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * pow(num, pow - 1);
    }
}
