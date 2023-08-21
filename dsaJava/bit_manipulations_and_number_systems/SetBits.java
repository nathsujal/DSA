package bit_manipulations_and_number_systems;

import java.util.*;

public class SetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int noOfSetBits = noOfSetBits(num);
        System.out.println("No of set bits in " + num + " is " + noOfSetBits + ".");
        in.close();
    }

    public static int noOfSetBits(int num) {
        int count1 = 0;
        while (num > 0) {
            // extracting the last bit
            int lastBit = num & 1;
            if (lastBit == 1) {
                count1++;
            }
            // eleminite the current last bit
            num = num >> 1;
        }
        return count1;
    }
}
