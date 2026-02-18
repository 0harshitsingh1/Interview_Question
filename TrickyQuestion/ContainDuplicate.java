package TrickyQuestion;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int num : nums){
            if(st.contains(num)){
                return true;
            }else{
                st.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainDuplicate cDuplicate = new ContainDuplicate();

        int[] nums = {1,2,3,1};
        
        System.out.println(cDuplicate.containsDuplicate(nums));
    }
}
