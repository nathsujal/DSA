package array;

import java.util.*;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Syntax
         * ArrayList<ArrayList<generic>> variable_name = new ArrayList<>();
         */

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println("\nMulti-Dimensional ArrayList: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
