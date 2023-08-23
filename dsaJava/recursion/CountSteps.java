package recursion;

import java.util.Scanner;

public class CountSteps {
    static int noOfSteps = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number: ");
        int num = in.nextInt();
        int steps = numberOfSteps(num);
        System.out.printf("No of steps = %d\n", steps);
        in.close();
    }

    public static int numberOfSteps(int num) {
        if (num == 0) {
            return noOfSteps;
        }
        if (num % 2 == 0) {
            noOfSteps++;
            return numberOfSteps(num / 2);
        }
        noOfSteps++;
        return numberOfSteps((num - 1));
    }
}
