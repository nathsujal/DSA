package recursion;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean pallindrome = isPallindrome(num);
        if (pallindrome) {
            System.out.println(num + " is a pallindrome.");
        } else {
            System.out.println(num + " is not a pallindrome.");
        }
        in.close();
    }

    public static boolean isPallindrome(int num) {
        int reverseNum = rNum(num);
        if (reverseNum == num) {
            return true;
        }
        return false;
    }

    public static int rNum(int num) {
        if (num == 0) {
            // end condition
            return 0;
        }
        int last_digit = num % 10;
        num = num / 10;
        int initialDigit;
        if (num == 0) {
            // as incase when num == 0
            // Math.log(0) == -infinity
            // so Math.pow(10, -infinity) -> 0
            // thus initialDigit -> 0
            // to correct it
            // we make initialDigit = last_digit, directly
            initialDigit = last_digit;
        } else {
            initialDigit = last_digit * (int) Math.pow(10, (int) Math.log10(num) + 1);
        }
        return initialDigit + rNum(num);
    }
}
