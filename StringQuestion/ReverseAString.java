package StringQuestion;

public class ReverseAString {

    public static void main(String[] args) {
        String str = "Harshit";
        System.out.println("harshit"); // Calling recursion method

        // Using Build-in fuction
        System.out.println(new StringBuilder(str).reverse());

        // Using loop
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
    }

    // Using Recursion

    static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1) + str.charAt(0));

    }
}
