package ArrayQuestion;

import java.util.HashMap;
import java.util.Map;

public class  CountFrequency {
    static void countFrequency(int[] nums){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,2,4};
        countFrequency(nums);
    }   
}
