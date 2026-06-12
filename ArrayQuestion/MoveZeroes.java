package ArrayQuestion;

public class MoveZeroes {

    static void moveZeroes(int[] nums){
        int insetPostion = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[insetPostion++] = nums[i];
            }
        }

        while(insetPostion < nums.length){
            nums[insetPostion++] = 0; 
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,0,5,2 ,0};
        moveZeroes(nums);
        for(int num : nums){
            System.out.print(num + ", ");
        }
    }
}
