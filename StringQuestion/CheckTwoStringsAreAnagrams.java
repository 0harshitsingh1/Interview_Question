package StringQuestion;

class CheckTwoString{
    boolean isAnagram(String s1, String s2){

        if (s1.length() != s2.length()) {
            return false;
        }
        
        s1 = s1.toLowerCase().replace(" " , "");
        s2 = s2.toLowerCase().replace(" " , "");

        int[] count = new int[256];

        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            count[s2.charAt(i)- 'a']--;
        }

        for(int i=0; i<count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
public class  CheckTwoStringsAreAnagrams {
    public static void main(String[] args) {
        CheckTwoString ca = new CheckTwoString();
        String str1 = "cat";
        String str2 = "Act";

        if(ca.isAnagram(str1, str2)){
            System.out.println("Given String is Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
