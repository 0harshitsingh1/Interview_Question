package ArrayQuestion;

import java.util.Arrays;

public class PairWithGivenSumInSortedArray {
    public static int[] SumSortedArray(int[] arr , int k){
        int left = arr[0];
        int right = arr.length-1;
        int currSum = 0;

        while (left < right) {
            currSum = arr[left] + arr[right];

            if(currSum == k){
                return new int[]{arr[left] , arr[right]};
            }
            else if( currSum < k){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
   public static void main(String[] args) {

        int[] arr = {1,2,3,4,6};
        int k = 6;
        int[] res = PairWithGivenSumInSortedArray.SumSortedArray(arr, k);
        if (res != null) {
            System.out.println("Pair found: " + Arrays.toString(res));
        } else {
            System.out.println("No pair found.");
        }
   } 
}
