package StringQuestion;

import java.util.HashMap;
import java.util.Map;

public class StroboGrammetic {
    static boolean isStrobogrammetic(Map<Character, Character> map, String s) {
        int i=0,j=s.length()-1;

        while(i <= j) {
            char l = s.charAt(i),
                r = s.charAt(j);

            if(map.containsKey(l)) {
                if(map.get(l) != r) {
                    return false;
                }else {
                    i++; 
                    j--;
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "198861";
        String s2 = "198860";

        Map<Character, Character> map = new HashMap<>();
            map.put('0', '0');
            map.put('1', '1');
            map.put('8', '8');
            map.put('9', '6');
            map.put('6', '9');
            

        System.out.println(isStrobogrammetic(map , s1));
    }
}

