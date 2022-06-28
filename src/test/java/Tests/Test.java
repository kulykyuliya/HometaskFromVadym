package Tests;

public class Test {
    public static void main(String[] args) {
        String name = "vwrav";
        char[] names = name.toCharArray();

        for (int i = 0; i < names.length/2; i++) {
            if (names[i] != names[names.length - 1-i]) {
                System.out.println("the word not polindrom");
                return;

            }
        }
        System.out.println("the word is polidrom");
    }
}
