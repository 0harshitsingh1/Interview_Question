package ArrayQuestion;

public class  RemoveDuplicatesFromSortedArray {
    int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }




    public static void main(String[] args) {
        // int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();

        int res = obj.removeDuplicates(nums);

        System.out.println("No. of unique element " + res);

        for(int x = 0; x < res; x++){
            System.out.print(nums[x] + " ");
        }

    }
}
