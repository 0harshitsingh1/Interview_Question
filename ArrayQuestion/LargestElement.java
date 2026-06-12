package ArrayQuestion;

import java.util.Arrays;

public class  LargestElement {
    public static void main(String[] args) {
        int[] arr = {5,6,3,8,2};

        // Using Build-in function
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);


        // Using for loop
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
