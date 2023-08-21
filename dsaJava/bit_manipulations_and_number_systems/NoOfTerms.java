package bit_manipulations_and_number_systems;

import java.util.*;

public class NoOfTerms {
    /*
     * given a number of base b, find the no of terms it has.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int terms = noOfTerms(base, num);
        int terms_byFormula = noOfTerms_Formula(base, num);
        System.out.printf("No. of terms in binary form of %d is %d.\n", num, terms);
        System.out.println("No of terms by using formula.");
        System.out.printf("No. of terms in %d base %d is %d.\n", num, base, terms_byFormula);
        in.close();
    }

    public static int noOfTerms(int base, int num) {
        int count = 0;
        while (num > 0) {
            num = num >> 1;
            count++;
        }
        return count;
    }

    public static int noOfTerms_Formula(int base, int num) {
        System.out.println(Math.log(num) / Math.log(base));
        return (int) (Math.log(num) / Math.log(base) + 1);
        // to find log of a custom base
        // ans = Math.log(num) / Math.log(custom_base) + 1
    }
}
