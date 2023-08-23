package recursion.Problems.Easy;

import java.util.*;

public class ConsequtiveCharacters {
    /*
     * Remove all Consecutive Duplicates from a String
     * 
     * article link:
     * https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
     * 
     * Problem:
     * Given a string S, The task is to remove all the consecutive duplicate
     * characters of the string and return the resultant string.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String new_str = removeConsecutiveDuplicates(str);
        System.out.println("Original String: " + str);
        System.out.println("New String: " + new_str);
        in.close();
    }

    static String removeConsecutiveDuplicates(String str) {
        return helper(str, 0, "");
    }

    static String helper(String str, int i, String res) {
        if (i == str.length()) {
            return res;
        }

        if (i == 0) {
            res += str.charAt(i);
        } else if (str.charAt(i - 1) != str.charAt(i)) {
            res += str.charAt(i);
        }
        return helper(str, i + 1, res);
    }
}
