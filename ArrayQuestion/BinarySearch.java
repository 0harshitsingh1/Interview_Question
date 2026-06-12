package ArrayQuestion;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        // int mid = 0;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }else {
                return mid; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 20, 24, 34, 35, 63};
        int target = 63;

        int res = binarySearch(arr, target);
        System.out.println(res);

        if (res != -1) {
            System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found");
        }
    }
}
