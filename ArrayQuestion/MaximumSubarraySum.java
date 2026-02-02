package ArrayQuestion;

public class MaximumSubarraySum {

    // Brute Force approch (TC --> O(n^2))
    public static int maximumSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            int currSum = 0;

            for(int j=i; j<arr.length; j++){
                currSum +=  arr[j];
                maxSum = Math.max(currSum , maxSum);
            }
        }
        return maxSum;
    }
    
    // Using Kadane’s Algorithm (Optimal solution) --> TC : O(n).
    public static int maxSum(int[] arr){
        int maxSum = 0;
        int currSum = 0;

        for(int i=0; i<arr.length; i++){

            currSum = Math.max(arr[i], arr[i] + currSum);

            maxSum = Math.max(currSum , maxSum);
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSum(arr));
        System.out.println(maxSum(arr));

    }
}
