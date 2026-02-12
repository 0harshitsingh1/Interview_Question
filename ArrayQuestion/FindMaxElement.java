package ArrayQuestion;

public class FindMaxElement {

    public int Max (int[] arr) {
    //     Arrays.sort(arr);

    //     int res = arr[arr.length-1];
    //     return res;

        int res = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                res = arr[i];
            }else{
                res = arr[i+1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9,4,7,5,2,34};

        FindMaxElement findMax = new FindMaxElement();
        System.out.println(findMax.Max(arr));
    }
}
