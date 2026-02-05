package ArrayQuestion;

import java.util.HashMap;

public class ContinuousSubarraySum {
    static boolean subarraySum(int[] nums , int k){

        if (k == 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == 0 && nums[i - 1] == 0) {
                    return true;
                }
            }
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];

            int rem = totalSum % k;

            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {
                int prevIdx = map.get(rem);
                if (i - prevIdx >= 2) return true;
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 13;
        System.out.println(subarraySum(nums , k));
    }
}
