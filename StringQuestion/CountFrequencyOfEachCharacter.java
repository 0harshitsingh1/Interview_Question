package StringQuestion;

import java.util.HashMap;
import java.util.Map;

class CountFrequency{
    void countFrequency(String str){
        
        str = str.toLowerCase().trim();
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
public class CountFrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "Java Programming";

        CountFrequency cF = new CountFrequency();
        cF.countFrequency(str);
    }
}
