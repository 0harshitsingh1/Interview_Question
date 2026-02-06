package ArrayQuestion;

public class MoveZeroes {

    static void moveZeroes(int[] nums){
        int insertPosition = 0;

        for(int i=0; i<nums.length; i++){
            if (nums[i] != 0){
                nums[insertPosition++] = nums[i];
            }
        }

        while(insertPosition < nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
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
