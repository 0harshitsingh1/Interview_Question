package StringQuestion;

import java.util.*;

class LongestCommon{
    public String findLongestCommon(String[] strs){

        Arrays.sort(strs);

        int index = 0;
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                index++;
            }else{
                break;
            }
        }
        if(index == 0) return "";

        return str1.substring(0, index);

    }
}
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"banana", "apple", "cat"};
        

        LongestCommon longestCommon = new LongestCommon();

        System.out.println(longestCommon.findLongestCommon(str));
    }
}
