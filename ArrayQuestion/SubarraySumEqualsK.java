package ArrayQuestion;

import java.util.HashMap;

public class SubarraySumEqualsK {
    static int subarraySum(int[] nums, int k){
        int currSum = 0;
        int count = 0;

        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0, 1);

        for(int i=0; i<nums.length; i++){
            currSum += nums[i];

            if(mp.containsKey(currSum - k)){
                count += mp.get(currSum-k);
            }
            mp.put(currSum, mp.getOrDefault(currSum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        System.out.println(subarraySum(nums, k));
    }
}
