package ArrayQuestion;

import java.util.Arrays;

public class SubarrayWithGivenSum {
    public static int[] subArray(int[] arr, int k) {
        int currSum = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            while (currSum > k && start < i) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == k) {
                return Arrays.copyOfRange(arr, start, i + 1);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int k = 12;
        int[] result = subArray(arr, k);

        if (result != null) {
            System.out.println("Subarray found: " + Arrays.toString(result));
        } else {
            System.out.println("No subarray with given sum found.");
        }
    }
}
