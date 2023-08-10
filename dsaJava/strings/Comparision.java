package strings;

public class Comparision {
    public static void main(String[] args) {
        String a = new String("Sujal");
        String b = new String("Sujal");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String n = "Nath";
        String m = "Nath";

        System.out.println(n == m);
        System.out.println(n.equals(m));

        /*
         * == operatior : checks whether the ref variables are pointing to same object
         * .equals() : checks the values the ref variables have
         */
    }
}
