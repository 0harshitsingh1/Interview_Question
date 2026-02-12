package ArrayQuestion;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum (int[] arr , int target){
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int sub = target - arr[i];
            
            if(map.containsKey(sub)){
                return new int[]{map.get(sub) , i};
            }
            map.put(arr[i] , i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        // int[] arr = {2,7,11,15};
        int[] arr = {3,2,4};
        int target = 6;

        TwoSum tS = new TwoSum();
        int[] res = tS.twoSum(arr, target);

        for(int num : res){
            System.out.print(num + " ");
        }
    }
}
