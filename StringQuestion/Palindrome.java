package StringQuestion;

class CheckPalindrome{
    boolean isPalindrome(String str){
        str = str.trim();
        String rev = "";

        // Using two Pointer approach (It needs extra memory "rev")
        // for(int i=str.length()-1; i>=0; i--){
        //     rev = rev + str.charAt(i);
        // }

        // if(rev.equals(str)){
        //     return "True";
        // }else{
        //     return "False";
        // }


        // Using while loop (It does not used extra memory hence it is optimal sol.)
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }   
}
public class Palindrome {
    public static void main(String[] args) {
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        String str = "aswerffrewsa";

        System.out.println(checkPalindrome.isPalindrome(str));

    }
}
