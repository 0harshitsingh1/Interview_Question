package StringQuestion;

class FindingSubString {

    public int finding(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();

        if (n < m) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            if (str1.substring(i, i + m).equals(str2)) {
                return i;
            }
        }

        return -1;
    }
}

public class FindSubString_1 {

    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "World";

        FindingSubString fs = new FindingSubString();
        int result = fs.finding(str1, str2);

        System.out.println("Substring start from: " + result);
    }
}