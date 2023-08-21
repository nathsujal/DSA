package bit_manipulations_and_number_systems;

import java.util.Scanner;

public class RangeXOR {
    /*
     * find the xor of numbers in a range[a,b].
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        int xorInRange = xorInRange(a, b);
        System.out.printf("XOR from %d to %d is %d.\n", a, b, xorInRange);
        in.close();
    }

    public static int xorInRange(int a, int b) {
        // a^a+1^...^b = (0^1^...^b) ^ (0^1^...^a-1)
        return xorTillN(b) ^ xorTillN(a - 1);
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
