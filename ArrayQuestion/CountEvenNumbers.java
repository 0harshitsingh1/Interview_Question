package ArrayQuestion;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {8,3,8,9,1};

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
