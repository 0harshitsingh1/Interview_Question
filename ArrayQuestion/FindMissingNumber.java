package ArrayQuestion;

public class FindMissingNumber {

    public void findNumber(int[] arr , int n){

        // Using Guess method
        // int expected = n * (n+1) / 2;
        // int currSum = 0;

        // for(int i=0; i<arr.length; i++){
        //     currSum += arr[i];
        // }

        // System.out.println(expected - currSum);

        // Using XOR Gate

        int x1 = 0;
        int x2 = 0;

        for(int i=0; i<n-1; i++){
            x1 = x1 ^ arr[i];
        }

        for(int i=1; i<=n; i++){
            x2 = x2 ^ i;
        }

        System.out.println(x1 ^ x2);
    }
    public static void main(String[] args) {
        FindMissingNumber num = new FindMissingNumber();

        int nums[] = {1,3,5,4};
        int n = 5;

        num.findNumber(nums,n);
    }
}
