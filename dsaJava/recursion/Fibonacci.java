package recursion;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        in.close();
        System.out.printf("Fibonacci series upto %d-terms: %d %d ", n, 0, 1);
        fibonacci(n - 2, 0, 1);
    }

    static void fibonacci(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        a = b;
        b = c;
        System.out.printf("%d ", c);
        fibonacci(n - 1, a, b);
    }
}
