package bit_manipulations_and_number_systems;

import java.util.Scanner;

public class SetIthBitAs1 {
    /*
     * given a decimal number, set the ith bit in its binary form as 1.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter i: ");
        int i = in.nextInt();
        int new_n = setIthBitAs1(n, i);
        System.out.printf("After setting the %d-th term as 1 in %d.\nThe new number is %d.\n", i, n, new_n);
        in.close();
    }

    public static int setIthBitAs1(int num, int i) {
        /*
         * any bit | 1 = 1
         * and to reach the ith bit of num
         * we left shilf 1 by (i - 1)
         * So, to set the i-th bit as 1, we use: num | (1 << (i - 1))
         * 
         */
        int new_num = (num | (1 << (i - 1)));
        return new_num;
    }
}
