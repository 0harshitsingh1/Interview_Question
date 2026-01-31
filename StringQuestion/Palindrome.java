package StringQuestion;

class CheckPalindrome{
    String isPalindrome(String str){
        str = str.trim();
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(rev.equals(str)){
            return "True";
        }else{
            return "False";
        }
    }
}
public class Palindrome {
    public static void main(String[] args) {
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        String str = "aswerffrewsa";

        System.out.println(checkPalindrome.isPalindrome(str));

    }
}
