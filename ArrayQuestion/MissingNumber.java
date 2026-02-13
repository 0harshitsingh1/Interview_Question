package ArrayQuestion;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int res = nums.length;

        for(int i=0; i<nums.length; i++){
            res = res ^ i ^ nums[i];
        }

        System.out.println(res);
    }
}
