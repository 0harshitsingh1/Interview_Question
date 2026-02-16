package TrickyQuestion;
/*
A happy number is a number defined by the following process:
--> Starting with any positive integer, replace the number by the sum of the 
    squares of its digits.
--> Repeat the process until the number equals 1 (where it will stay), or it 
    loops endlessly in a cycle which does not include 1.
--> Those numbers for which this process ends in 1 are happy.
--> Return true if n is a happy number, and false if not.

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 
*/


import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>();

        while (true) {
            int sum =0;

            while(n != 0){
                sum += Math.pow(n%10, 2.0);
                n = n/10;
            }

            if(sum == 1) return true;

            n = sum;

            if(st.contains(n)){
                return false;
            }else{
                st.add(n);
            }
        }
    }
    public static void main(String[] args) {
        // int nums = 19;
        int nums = 2;

        HappyNumber hn = new HappyNumber();
        if(hn.isHappy(nums) == true){
            System.out.println("Number is Happy number.");
        }else{
            System.out.println("Number is not Happy number.");
        }
    }
}
