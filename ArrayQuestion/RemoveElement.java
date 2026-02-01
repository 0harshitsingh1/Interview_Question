package ArrayQuestion;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int i = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {3,2,2,3};
        int val = 3;

        int k = re.removeElement(nums, val);
        System.out.println("No. of unique element: " + k);

        for(int x = 0; x < k; x++){
            System.out.print(nums[x] + " ");
        }
    }
}
