package ArrayQuestion;
import java.util.HashSet;


public class RemoveDuplicate {


    static void remove(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,2,4};
        remove(nums);
    }
}
