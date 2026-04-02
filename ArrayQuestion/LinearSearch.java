package ArrayQuestion;

public class LinearSearch {
    
    public static int linearSearch(int[] s, int target) {
        for(int i=0; i<s.length; i++){
            if(s[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,5,0,6,7};
        int target = 0;

        int res = linearSearch(arr, target);
        System.out.println(res);
    }
}
