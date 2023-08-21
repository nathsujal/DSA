package bit_manipulations_and_number_systems;

import java.util.Scanner;

public class XOR {
    /*
     * Find the XOR of nos from 0 to n.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int xor_0_to_n = xorTillN(n);
        System.out.printf("XOR from 0 to %d is %d.\n", n, xor_0_to_n);
        in.close();
    }

    public static int xorTillN(int n) {
        /*
         * Pattern recognised through observation
         */
        if (n % 4 == 0) {
            // if n % 4 == 0 => 0^1^2^...^n = n
            return n;
        } else if (n % 4 == 1) {
            // if n % 4 == 1 => 0^1^2^...^n = 1
            return 1;
        } else if (n % 4 == 2) {
            // if n % 4 == 2 => 0^1^2^...^n = n+1
            return n + 1;
        }
        // if n % 4 == 3 => 0^1^2^...^n = 0
        return 0;
    }
}
