package StringQuestion;

class Compress {
    public void compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }

        }
        System.out.println(sb);

    }
}

public class StringCompressor_2 {
    public static void main(String[] args) {
        Compress c = new Compress();

        String str = "aabbddwew";

        c.compress(str);
    }
}