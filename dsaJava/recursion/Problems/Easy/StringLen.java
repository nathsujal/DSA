package recursion.Problems.Easy;

import java.util.*;

public class StringLen {
    /*
     * Program for length of a string using recursion
     * 
     * https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
     * 
     * Problem:
     * Given a string calculate length of the string using recursion.
     * 
     * Examples:
     * Input : str = "abcd"
     * Output :4
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("sting: ");
        String str = in.nextLine();
        int len = strLen(str);
        System.out.printf("Length of %s is %d.\n", str, len);
        in.close();
    }

    public static int strLen(String str) {
        // end condition
        // if str == ""
        // then return
        if (str.equals("")) {
            return 0;
        }
        // str.substring(beginIndex) => returns a substring
        // gives a sub-string from beginIndex(specified)
        return strLen(str.substring(1)) + 1;
        // eliminating the 0th index char from the string
        // and counting the no of elements
    }
}
