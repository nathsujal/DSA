package recursion.Problems.Easy;

import java.util.*;

public class Print1toN {
    /*
     * Print 1 To N Without Loop
     * 
     * Print numbers from 1 to N without the help of loops.
     * 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        System.out.println("Output: ");
        printNos(n);
        in.close();
    }

    public static void printNos(int n) {
        if (n == 0) {
            return;
        }
        printNos(n - 1);
        System.out.print(n + " ");
    }
}
