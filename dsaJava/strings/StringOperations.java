package strings;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // int will be converted to Integer that will call toString()
    }
}
