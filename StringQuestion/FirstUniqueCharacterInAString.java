package StringQuestion;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        HashMap<Character , Integer> mp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            mp.put(c , mp.getOrDefault(c , 0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(mp.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // String s = "leetcode";
        String s = "loveleetcode";

        FirstUniqueCharacterInAString fucs = new FirstUniqueCharacterInAString();
        System.out.println(fucs.firstUniqChar(s));
    }
}
