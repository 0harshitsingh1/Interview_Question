package ArrayQuestion;

public class MoveAllZerosToTheEnd {

    static void movingAllZero(int[] nums) {
        int insertpositon = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertpositon] = nums[i];
                insertpositon++;
            }
        }

        while (insertpositon < nums.length) {
            nums[insertpositon] = 0;
            insertpositon++;
        }
    }
    
    

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        movingAllZero(nums);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
